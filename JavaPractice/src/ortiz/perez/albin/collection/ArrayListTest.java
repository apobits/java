/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.ArrayList;

/**
 * @author aposo
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> c = new ArrayList<>();
		c.add("a");
		c.add("i");
		c.add("o");
		c.add("u");
		System.out.println(c.toString());
		c.add(1, "e");
		c.add("x");
		System.out.println(c.toString());
		c.removeIf(t -> t.equals("x"));
		System.out.println(c.toString());

	}

}
