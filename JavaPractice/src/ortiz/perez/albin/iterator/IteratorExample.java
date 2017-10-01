/**
 * 
 */
package ortiz.perez.albin.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Administrador
 *
 */
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println();
		}

	}

}
