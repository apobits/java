/**
 * 
 */
package ortiz.perez.albin.jump.statement;

/**
 * @author aposo
 *
 */
public class Break {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("i" + i + "  ");
			for (int j = 0; j < 10; j++) {
				System.out.print("j" + j + " ");
				if (j % 2 != 0) {
					System.out.println();
					break;// Exits both for loops
				}
			}
		}

	}

}
