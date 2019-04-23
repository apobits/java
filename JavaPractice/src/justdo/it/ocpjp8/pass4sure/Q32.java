/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q32 {

	static interface Readable {
		public void read();

		public static void close() {
			System.out.print(" Close ");
		}
	}

	static interface Writable extends Readable {
		public default void write() {
			read();
			System.out.println("Welcome");
		}
	}

	static class Canvas implements Writable {

		@Override
		public void read() {
			System.out.print("Hello ");

		}

	}

	public static void main(String[] args) {
		Writable canvas1 = new Canvas();
		canvas1.write();
//		Writable.close(); //undefined method for Writable interface, static methods are not inherited 

	}

}
