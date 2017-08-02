/**
 * 
 */
package ortiz.perez.albin.enums;

/**
 * @author Administrador
 *
 */
public class TestA {

	public static void switchEnum(A a) {

		switch (a) {
		case A:
			System.out.println(A.A);
			break;
		case B:
			System.out.println(A.B);
			break;
		case C:
			System.out.println(A.C);
			break;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = A.B;
		System.out.println("Value of type A enum passed to a switch");
		TestA.switchEnum(a);

		System.out.println("A.C passed to println");
		System.out.println(A.C);

		System.out.println("Printing values in a for each style loop");
		for (A x : A.values())
			System.out.print(x);

	}

}
