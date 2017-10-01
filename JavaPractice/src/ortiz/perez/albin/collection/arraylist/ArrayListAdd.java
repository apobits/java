/**
 * 
 */
package ortiz.perez.albin.collection.arraylist;

import java.util.ArrayList;

/**
 * @author Administrador
 *
 */
public class ArrayListAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(3);
		numbers1.add(4);
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(5);
		numbers2.add(6);

		// adds an element to the next available position
		numbers.add(1);

		// adds an element to the specified position
		numbers.add(0, 2);

		// adds a collection starting from the next available position
		numbers.addAll(numbers1);

		// adds a collection starting from the specified position
		numbers.addAll(0, numbers2);
		System.out.println(numbers);

		// sets the element at the specified index, the old element is deleted
		numbers.set(0, 1);

		System.out.println(numbers);

	}

}
