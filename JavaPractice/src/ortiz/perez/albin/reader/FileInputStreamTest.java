/**
 * 
 */
package ortiz.perez.albin.reader;

import java.io.FileInputStream;

/**
 * @author aposo
 *
 */
public class FileInputStreamTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	FileInputStream fileInputStream = null;
	try {
	    fileInputStream = new FileInputStream("C:/Users/aposo/Desktop/test.txt");
	    int c;
	    do {
		c = fileInputStream.read();
		if (c != -1)
		    System.out.print((char) c);
	    } while (c != -1);
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		fileInputStream.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

    }
}
