/**
 * 
 */
package ortiz.perez.albin.statics;

/**
 * @author apo
 *
 */
// Working with static or global variables
public class StaticExample {
	// When the class is loaded the properties are set first then the static block
	// is called

	// static variable to be initialize when class is loaded by the static
	// method
	static String name;

	// static variable initialized when the class is loaded
	static String lastName = "Perez";

	// initialize the static class property
	static {
		name = "Albin";
	}

	public static void main(String[] args) {
		System.out.print(StaticExample.name);
		System.out.print(" ");
		System.out.println(StaticExample.lastName);

		StaticExample e1 = new StaticExample();

		StaticExample e2 = new StaticExample();

		e1.lastName = "Ortiz";

		System.out.println(e2.lastName);

	}

}
