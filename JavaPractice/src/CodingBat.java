/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class CodingBat {

	static boolean countXX(String str) {
		int index = str.indexOf("x");

		return (str.length() - 1 != index) && (str.charAt(index + 1) == 'x') ? true : false;
	}

	public static void main(String[] args) {
		String x = "HixxElxxyxxxnxx";
		System.out.println(countXX(x));
	}

}
