/**
 * 
 */
package practice.java.nio;

import java.util.LinkedList;
import java.util.List;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		var listI = list.listIterator();

		listI.next();
		listI.remove();
		System.out.println(list);

	}
}
