/**
 * 
 */
package practice.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author aposo
 *
 */
public class SetExample {

	public void hashSet() {
		//best performance implementation but does not guarantee the order of elements
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(5);
		
		set.remove(2);
		
		set.contains(3);
		
		set.removeIf(t->t.equals(5));
	}

	public void treeSet() {
		
		//black red tree implementation, sorted according to the natural order of the elements 
		Set<Integer> set = new TreeSet<>();
		

	}

	public void linkedHashSet() {
		
		//second better performance implementation, it guarantees the order of elements as they were inserted
		Set<Integer> set = new LinkedHashSet<>();
		

	}

	public static void main(String[] args) {

	}

}
