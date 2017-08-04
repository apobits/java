/**
 * 
 */

/**
 * @author aposo
 *
 */
public class Test {

	public boolean stringE(String str) {
		int count = 0;
		char x[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (x[i] == 'e')
				count++;
			if (count > 3)
				return false;
		}

		return count == 0 ? false : true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Test().stringE("Heelele"));
	}

}
