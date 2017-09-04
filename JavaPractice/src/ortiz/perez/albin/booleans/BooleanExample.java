/**
 * 
 */
package ortiz.perez.albin.booleans;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Administrador
 *
 */
public class BooleanExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Boolean b = Boolean.TRUE;

		System.out.println(b.booleanValue());

		Runtime r = Runtime.getRuntime();// gets a reference to the runtime
											// object associated with the
											// current application
		System.out.println("total memory " + r.totalMemory());
		System.out.println("free memory " + r.freeMemory());
		System.out.println("max memory " + r.maxMemory());
		System.out.println("available processors " + r.availableProcessors());
		System.out.println("garbage collector call");
		r.gc();
		System.out.println("total memory " + r.totalMemory());
		System.out.println("free memory " + r.freeMemory());
		System.out.println("max memory " + r.maxMemory());
		byte[] x = "hola".getBytes();
		try {
			Process p = new ProcessBuilder("notepad").start();
			BufferedWriter in = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));

			in.write("hola");
			in.flush();
			
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
		
		char [] y = {'a','b','c'};
		char [] z = new char[y.length];
		System.arraycopy(y, 0, z, 0, y.length);
		System.out.println(z);

	}

}
