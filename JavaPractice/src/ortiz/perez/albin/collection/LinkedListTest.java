/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author aposo
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> words = new LinkedList<>();
		words.add("A");
		words.add("B");
		words.add("C");

		words.forEach(x -> System.out.print(x));// using lambda expression

		System.out.println(words.get(2));
		
		TreeSet<String> s = new TreeSet<>();
		s.add("a");
		s.add("z");
		s.add("f");
		
		s.forEach(x -> System.out.print(x));

	}

}
