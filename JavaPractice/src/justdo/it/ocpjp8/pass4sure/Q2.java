/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String var = args.length == 1 ? args[0] : "Kava";

		switch (var.replace('v', 'w')) {
		case "Kava":
			System.out.println("Kava");
			break;
		case "kava":
			System.out.println("kava");
			break;
		case "Kawa":
			System.out.println("Kawa");
			break;
		case "kawa":
			System.out.println("kawa");
			break;
		}
	}

}
