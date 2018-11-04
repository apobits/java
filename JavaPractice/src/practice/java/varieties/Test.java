/**
 * 
 */
package practice.java.varieties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author apobits@gmail.com
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		LinkedList<String> d = new LinkedList<>(c);

		c.add("a");
		c.add("e");
		c.add("i");
		c.add("o");
		c.add("u");

		d.add("b");
		d.add("c");
		d.add("d");
		d.add("f");
		d.add("g");

		c.forEach(t -> System.out.print(t));
		System.out.println();
		d.forEach(t -> System.out.print(t));

		// TODO Auto-generated method stub

	}

}
