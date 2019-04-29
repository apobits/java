/**
 * 
 */
package practice.java.collection.factorymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author aposo
 *
 */
public class ListFactoryMethodExample {

	public static void oldUnmodifiableList() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers = Collections.unmodifiableList(numbers);
		System.out.println(numbers);
	}

	public static void newUnmodifiableList() {
		List<Integer> numbers = List.of(1, 2);
		System.out.println(numbers);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		newUnmodifiableList();

	}

}
