/**
 * 
 */
package ortiz.perez.albin.statics;

/**
 * @author apo
 *
 */
// Working with static or global variables
public class StaticExample2 {

	// static variable to be initialize when class is loaded by the static
	// method
	static String name;

	// static variable initialized when declared
	static String lastName = "Perez";

	// initialize the static class property
	static {
		name = "Albin";
	}

	public static void main(String[] args) {
		System.out.print(StaticExample2.name);
		System.out.print(" ");
		System.out.println(StaticExample2.lastName);

	}

}
