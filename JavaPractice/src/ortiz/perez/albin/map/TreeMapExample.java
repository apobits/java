/**
 * 
 */
package ortiz.perez.albin.map;

/**
 * @author Administrador
 *
 */
public class TreeMapExample {
	// TreeMap stores in sorted order, allows rapid retrieval
	public static int numberNeeded(String first, String second) {
		String a = null, b = null;
		String regex = "^.*x.*$";
		if (second.matches(regex.replace("x", String.valueOf(first.charAt(first.length() - 1))))) {
			a = first;
			b = second;
		} else if (first.matches(regex.replace("x", String.valueOf(second.charAt(second.length() - 1))))) {
			a = second;
			b = first;
		}
		int count = 0;
		StringBuilder sb = new StringBuilder(a.charAt(a.length() - 1));
		for (int i = 0; i < a.length() - 2; i++) {
			if (!second.matches(regex.replace("x", sb.append(a.charAt(i)).toString()))) {
				break;
			}
			count++;
		}
		return a.length() - count;
	}

	public static void main(String[] args) {

		System.out.println(numberNeeded("bacdc", "dcbac"));

	}

}
