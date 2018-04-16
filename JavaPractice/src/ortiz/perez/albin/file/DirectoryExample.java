/**
 * 
 */
package ortiz.perez.albin.file;

import java.io.File;
import java.util.Arrays;

public class DirectoryExample {

    public static void main(String args[]) {
	File f = new File("C:\\Users\\Administrador\\Desktop\\mypackage");

	System.out.println(Arrays.toString(f.list()));
    }

}
