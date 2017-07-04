/**
 * 
 */
package ortiz.perez.albin.array;

/**
 * @author Administrador
 *
 */
public class ArrayExample {

	int array1[] = new int[10];

	int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String args[]) {
		ArrayExample ae = new ArrayExample();
		ae.array1[0] = 1;
		ae.array1[1] = 2;

		//array length is the size of the array not number of elements that are in use
		System.out.println("array1 length is: " + ae.array1.length);
		System.out.println("array2 length is: " + ae.array2.length);

	}

}
