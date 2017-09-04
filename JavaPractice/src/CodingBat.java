/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class CodingBat {

	static int countXX(String str) {
		String[] temp = str.split("xx");

		return temp.length / 2;
	}

	public static void main(String[] args) {
		System.out.println(countXX("HixxElxx"));

	}

}
