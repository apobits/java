/**
 * 
 */
package ortiz.perez.albin.utils;

/**
 * @author Administrador
 *
 */
public class FloatingPointRound {
	/**
	 * Format floating points
	 * 
	 * @param number
	 *            float value
	 * @param floatingPoints
	 *            to preserve
	 * @return string representation of the new formatted float value
	 */
	static String formatFloatingPoint(float number, int floatingPoints) {
		String[] temp = String.valueOf(number).split("\\.");
		char[] left = temp[1].toCharArray();
		StringBuilder sb = new StringBuilder(temp[0]);
		sb.append(".");
		if (floatingPoints < left.length) {
			for (int i = left.length - 1; i >= floatingPoints; i--) {
				if (left[i] >= 53)
					left[i - 1] = (char) (left[i - 1] + 1);
			}
			sb.append(new String(left).substring(0, floatingPoints));
		} else if (floatingPoints > left.length) {
			sb.append(left);
			for (int i = 0; i < floatingPoints - left.length; i++) {
				sb.append("0");
			}
		}
		return sb.toString();
	}
}
