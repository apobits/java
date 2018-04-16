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
		int[][] twoD = new int[2][3];// 2d different size multidimensional array
		int[][][] threeD = new int[2][][];// 3d different size, setting
											// OneDimension size
		threeD[0] = new int[3][];// Setting twoDimension size
		threeD[0][0] = new int[4];// Setting threeDimension size

		int[][] numbers = new int[2][2];
		int k = 0;

		// filling twoD numbers array
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				numbers[i][j] = k++;
			}
		}
		// iterating and printing twoD numbers array
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
		
	}


}
