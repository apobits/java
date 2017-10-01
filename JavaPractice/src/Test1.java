import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Test1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(new File("C:\\Users\\Administrador\\Desktop\\Request.txt"));
		while(sc.hasNextLine()){
			sb.append(sc.nextLine());
		}
		byte[] x = sb.toString().getBytes();
		System.out.println(x.length);

	}

}
