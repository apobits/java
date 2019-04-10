/**
 * 
 */
package justdo.it.ocpjp8;

/**
 * @author aposo
 *
 */
public class SwitchStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String var = args.length == 1 ? args[0] : "Kava";

		switch (var.replace('v', 'w')) {
		case "Kawa":
			System.out.println("Kawa K in uppercase");
			break;
		case "kawa":
			System.out.println("kawa k in lowercase");
			break;

		}

	}

}
