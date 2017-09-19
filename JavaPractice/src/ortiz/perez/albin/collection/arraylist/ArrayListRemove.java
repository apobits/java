/**
 * 
 */
package ortiz.perez.albin.collection.arraylist;

import java.util.ArrayList;

/**
 * @author Administrador
 *
 */
public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> letters = new ArrayList<>();
		ArrayList<String> letters1 = new ArrayList<>();
		letters1.add("f");
		letters1.add("g");

		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		letters.add("h");
		letters.add("i");

		// removes the element at the specified index
		letters.remove(0);

		// removes the first occurrence of the specified element
		letters.remove("b");

		// removes the elements that compared to the specified object are greater than
		letters.removeIf(t -> t.compareTo("g") > 0);
		
		//removes all the elements that matches the ones in the specified collection
		letters.removeAll(letters1);

		System.out.println(letters);
		
		
	}

}
