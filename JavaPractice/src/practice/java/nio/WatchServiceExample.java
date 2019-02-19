/**
 * 
 */
package practice.java.nio;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * @author apobits@gmail.com
 *
 */
public class WatchServiceExample {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path path = fs.getPath("C:\\Users\\Administrador\\Desktop\\test");
		WatchService watchService;
		try {
			watchService = fs.newWatchService();
			path.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
			WatchKey watchKey = watchService.take();
			for (WatchEvent<?> watchEvent : watchKey.pollEvents()) {
				System.out.println("Kind of event: " + watchEvent.kind());
				System.out.println("Directory: " + (Path)watchEvent.context());
				// using reset will allow the key to receive events again, when a loop is used
				watchKey.reset();
			}
			watchService.close();
		} catch (IOException e) {
			System.out.println(e);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
