/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class AdjacentPairsDeletion {

	public static void main(String[] args) {
		StringBuilder x = new StringBuilder("aaabccddd");
		int count = 1;
		while (count > 0) {
			count = 0;
			for (int i = 0; i < x.length() - 1; i++) {
				if (x.charAt(i) == x.charAt(i + 1)) {
					x.delete(i, i + 2);
					count++;
				}
			}
		}
		System.out.println(x.toString());
	}
}
