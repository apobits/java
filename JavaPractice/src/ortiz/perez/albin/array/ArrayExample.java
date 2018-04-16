/**
 * 
 */
package ortiz.perez.albin.array;

import java.util.Arrays;

/**
 * @author Administrador
 *
 */
public class ArrayExample {

	public static void main(String args[]) {
		int array1[] = new int[10];// one dimensional array
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		array1[0] = 1;
		array1[1] = 2;

		byte[] b = new byte[10];
		short[] s = new short[10];
		float[] f = new float[10];
		double[] d = new double[10];
		String[] ss = new String[10];
		
		// array length is the size of the array not number of elements that are
		// in use
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(ss));
		System.out.println("array1 length is: " + array1.length);
		System.out.println("array2 length is: " + array2.length);
		
		int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };
		int [][] x = {{1,2,3}};

	}

}
