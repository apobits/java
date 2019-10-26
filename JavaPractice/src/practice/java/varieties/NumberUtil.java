/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class NumberUtil {

	public static int binartyToDecimal(String binaryRepresentation) {
		int result = 0, init = 1;
		for (int i = binaryRepresentation.length() - 1; i >= 0; i--) {
			result += binaryRepresentation.charAt(i) == '1' ? init : 0;
			init *= 2;
		}
		return result;
	}

	public static int octalToDecimal(String octalNumber) {
		int result = 0, init = 1;
		String octalTemp = octalNumber.substring(1);
		int temp = Integer.valueOf(octalTemp);
		for (int i = 0; i < octalTemp.length(); i++) {
			result += (init * (temp % 10));
			temp = temp / 10;
			init *= 8;
		}

		return result;
	}

	public static void main(String args[]) {
		System.out.println(octalToDecimal("0377"));
	}

}
