/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectionIterationWithEnhancedFor {

    private static Collection<Integer> getCollection() {
	Collection<Integer> c = new ArrayList<>();
	c.add(1);
	c.add(2);
	c.add(3);
	return c;
    }

    public static void main(String[] args) {
	Collection<Integer> c = getCollection();
	ArrayList<Integer> d = (ArrayList<Integer>) c;
	// iterates the collection
	// down size remove is not possible here when using only the collection
	// interface
	// but possible using the implementation class and a counter index, but the for
	// will skip the number of elements remove at the end of the iteration so if
	// iterating [1,2,3] and 2nd element is remove element 3 is not iterated
	int index = 0;
	for (Integer x : c) {
	    System.out.print(x);
	    if (x == 2) {
		d.remove(index);
	    }
	    index++;
	}

	System.out.println();

	// iterates the array again
	for (Integer x : c) {
	    System.out.print(x);
	}

    }

}
