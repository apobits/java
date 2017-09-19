/**
 * 
 */
package ortiz.perez.albin.array;

/**
 * @author Administrador
 *
 */
public class MultidimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[2][2];
		int k = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				numbers[i][j] = k++;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}

	}

}
