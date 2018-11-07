/**
 * 
 */
package practice.java.collection;

import java.util.LinkedList;

/**
 * @author aposo
 *
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.push(1);
		ll.add(2);
		ll.add(null);
		ll.push(3);
		ll.add(null);
		ll.add(null);
		System.out.println(ll.pop());
	}

}
