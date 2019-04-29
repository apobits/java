/**
 * 
 */
package practice.java.collection.factorymethods;

import java.util.List;

/**
 * @author aposo
 *
 */
public class ListFactoryMethodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numbers = List.of(1);
		System.out.println(numbers.get(0));
		
		numbers.set(0, 1);

	}

}
