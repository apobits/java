/**
 * 
 */
package ortiz.perez.albin.jump.statement;

/**
 * @author aposo
 *
 */
public class LabeledContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		firstFor: for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
				if (j == (10 - i)){
					System.out.println();
					continue firstFor;// Exits inner for loop
				}
			}
		}

	}

}
