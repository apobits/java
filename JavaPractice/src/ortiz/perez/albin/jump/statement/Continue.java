/**
 * 
 */
package ortiz.perez.albin.jump.statement;

/**
 * @author aposo
 *
 */
public class Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);

		}

	}

}
