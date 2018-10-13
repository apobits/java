/**
 * 
 */
package practice.java.array;

/**
 * @author apobits@gmail.com
 *
 */
public class MultidimensionalArray {

	public static int[][] twoD() {
		int[][] a = new int[2][2];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = counter++;
			}
		}
		return a;
	}

	public static int[][][] threeD() {
		int[][][] threeD = new int[2][3][3];
		int counter = 0;
		for (int i = 0; i < threeD.length; i++) {
			for (int j = 0; j < threeD[i].length; j++) {
				for (int k = 0; k < threeD[i][j].length; k++) {
					threeD[i][j][k] = counter++;
				}
			}
		}

		return threeD;
	}

	public static void print2D(int[][] twoD) {
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
	}

	public static void print3D(int[][][] threeD) {
		for (int i = 0; i < threeD.length; i++) {
			for (int j = 0; j < threeD[i].length; j++) {
				for (int k = 0; k < threeD[i][j].length; k++) {
					System.out.print(threeD[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

//		print2D(twoD());

		print3D(threeD());

	}

}
