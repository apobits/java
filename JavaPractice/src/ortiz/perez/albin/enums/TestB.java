/**
 * 
 */
package ortiz.perez.albin.enums;

/**
 * @author Administrador
 *
 */
public class TestB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b = B.A;// Every time a variable of type B(Enum) is declared or
					// referenced, the constructor is called for each constant
					// specified
		System.out.println(B.A.ordinal());

		A x = A.A;
		B y = B.A;
		A z = A.A;
		System.out.println(new String("A") == "A");
		Class<?> cl = int.class;
	}

}
