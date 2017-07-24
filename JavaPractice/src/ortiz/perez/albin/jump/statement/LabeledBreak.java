/**
 * 
 */
package ortiz.perez.albin.jump.statement;

/**
 * @author aposo
 *
 */
public class LabeledBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		firstFor: for (int i = 0, j = 0; i < 10; i++) {
			System.out.println("i " + i);
			for (; j < 10; j++) {
				System.out.println("j " + j);
				if (j % 2 != 0)
					break firstFor;// Exits both for loops
			}
		}

	}

}
