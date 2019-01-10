/**
 * 
 */
package justdo.it.ocpjp8;

/**
 * @author Administrador
 *
 */
public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String action = "Hello";

		switch (action) {
		case "Hello":
			System.out.println("Hello there");
			break;
		case "GoodBye":
			System.out.println("Good bye, until next time");
			break;
		default:
			System.out.println("No case matched");
		}

		///////////////////////////////////
		byte b = 1_2_7;// binary literal

		switch (b) {
		case 1:
			System.out.println("byte is one");
			break;
		case 1_27:
			System.out.println("byte is 127");
			break;
		default:
			System.out.println("No case matched");
		}

		//////////////////////////////////
		int i = 1_23_4__5;// integer literal

		switch (i) {
		case 1:
			System.out.println("integer is 1");
			break;
		case 12345:
			System.out.println("integer is 12345");
			break;
		default:
			System.out.println("No case matched");
		}
	}

}
