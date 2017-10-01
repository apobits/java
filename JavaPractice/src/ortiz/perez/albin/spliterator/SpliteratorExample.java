/**
 * 
 */
package ortiz.perez.albin.spliterator;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * @author Administrador
 *
 */
public class SpliteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);

		Spliterator<Integer> spr = numbers.spliterator();
		int temp = 0;
		spr.forEachRemaining(n -> {
			System.out.print(n + " " + temp);
		});
	}

}
