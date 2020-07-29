package apo.utils;

import org.apache.commons.vfs2.*;
import org.apache.commons.vfs2.provider.sftp.IdentityInfo;
import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SFTPUtil {
    private final FileSystemManager fileSystemManager;
    private final FileSystemOptions fileSystemOptions;
    private final String baseURL;
    private final List<FileObject> fileObjects = new ArrayList<>();

    public SFTPUtil(String host, String user, String privatePublicKeyURL, int timeout, boolean isRootDirectory)
		    throws Exception {
	baseURL = "sftp://" + user + "@" + host;
	try {
	    fileSystemManager = VFS.getManager();
	    fileSystemOptions = createFileSystemOptions(timeout, isRootDirectory, new File(privatePublicKeyURL));
	} catch (FileSystemException e) {
	    throw e;
	}
    }

    public static void main(String[] args) {
	try {
	    SFTPUtil sftpUtil = new SFTPUtil("10.18.150.80", "j_mili", "D:\\stefanini\\projects\\resources-manager\\regional\\docs\\cr-009-EBS-Integration\\NonProdSFTP.ppk", 5000,
			    false);
	    FileObject[] fileObjects = sftpUtil.getFiles("/interface/j_mili/stefanini/source/", ".*INT004.*");
	    for (FileObject fileObject : fileObjects) {
		FileObject moved = sftpUtil.fileSystemManager
				.resolveFile(sftpUtil.baseURL + "/interface/j_mili/stefanini/target/" + fileObject.getName()
						.getBaseName(), sftpUtil.fileSystemOptions);
		StringBuilder stringBuilder = new StringBuilder();
		for (String line : sftpUtil.readLines(fileObject)) {
		    stringBuilder.append(line + "\n");
		}
		moved.createFile();
		sftpUtil.write(moved, stringBuilder.toString());
		fileObject.delete();
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private FileSystemOptions createFileSystemOptions(int timeout, boolean isRootDirectory, File ppkFile)
		    throws FileSystemException {
	FileSystemOptions fileSystemOptions = new FileSystemOptions();
	IdentityInfo identityInfo = new IdentityInfo(ppkFile);
	SftpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(fileSystemOptions, isRootDirectory);
	SftpFileSystemConfigBuilder.getInstance().setIdentityInfo(fileSystemOptions, identityInfo);
	SftpFileSystemConfigBuilder.getInstance().setTimeout(fileSystemOptions, timeout);

	return fileSystemOptions;
    }

    /**
     * Return the files from the source folder that matches the specified regex
     *
     * @param source source folder where the files are stored
     * @param regex  regular expression to match the files
     * @return array of FileObject instances
     * @throws Exception
     */
    public FileObject[] getFiles(String source, String regex) throws Exception {
	try {
	    FileObject[] files = fileSystemManager.resolveFile(baseURL + source, fileSystemOptions)
			    .findFiles(new PatternFileSelector(regex));
	    if (files != null) {
		fileObjects.addAll(Arrays.asList(files));
		return files;
	    }
	    return new FileObject[] {};
	} catch (FileSystemException e) {
	    throw e;
	}
    }

    /**
     * Obtain from the specified FileObject a list containing the lines of the file
     *
     * @param fileObject
     * @return the list containing the lines of the file
     * @throws Exception
     */
    public List<String> readLines(FileObject fileObject) throws Exception {
	BufferedReader bufferedReader = null;
	List<String> lines = new ArrayList<>();
	try {
	    bufferedReader = new BufferedReader(new InputStreamReader(fileObject.getContent().getInputStream()));
	    String line;
	    while ((line = bufferedReader.readLine()) != null) {
		lines.add(line);
	    }
	} catch (FileSystemException e) {
	    throw e;
	} finally {
	    if (bufferedReader != null) {
		try {
		    bufferedReader.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	}
	return lines;
    }

    /**
     * Close all the file objects that this class has produced
     * If FileObjects are created from those obtained from this class, remember to close them manually
     */
    public void close() {
	for (FileObject fileObject : fileObjects) {
	    try {
		fileObject.close();
	    } catch (FileSystemException e) {
		e.printStackTrace();
	    }
	}
	fileObjects.clear();
    }

    /**
     * Ad hoc move file method, it was created as not all SFTP servers support move command
     *
     * @param from FileObject to move
     * @param path Path where to put the new file
     * @throws Exception
     */
    public void moveFile(FileObject from, String path) throws Exception {
	FileObject fileObject = fileSystemManager
			.resolveFile(baseURL + path + from.getName().getBaseName(), fileSystemOptions);
	fileObject.createFile();
	write(fileObject, mergeLines(readLines(from)));
	from.delete();
	fileObjects.add(fileObject);
    }

    private String mergeLines(List<String> lines) {
	StringBuilder stringBuilder = new StringBuilder();
	for (String line : lines) {
	    stringBuilder.append(line).append("\n");
	}
	return stringBuilder.toString();
    }

    private void write(FileObject fileObject, String data) throws Exception {
	OutputStream outputStream = null;
	try {
	    outputStream = fileObject.getContent().getOutputStream();
	    if (outputStream != null) {
		outputStream.write(data.getBytes());
		outputStream.flush();
	    }
	} catch (IOException e) {
	    throw e;
	} finally {
	    if (outputStream != null) {
		try {
		    outputStream.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	}
    }
}
