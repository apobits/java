/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectionIterationWithIterator {

    private static Collection<Integer> getCollection() {
	Collection<Integer> c = new ArrayList<>();
	c.add(1);
	c.add(2);
	c.add(3);
	return c;
    }

    public static void main(String[] args) {
	// gets the collection
	Collection<Integer> c = getCollection();
	Iterator<Integer> ic;
	// old way to iterate over a collection is using Iterators
	ic = c.iterator();
	while (ic.hasNext()) {
	    int temp = ic.next();
	    System.out.print(temp);

	    // remove object from collection if its value is 2
	    if (temp == 2) {
		ic.remove();
	    }
	}
	System.out.println();
	// iterates over the collection again
	ic = c.iterator();
	while (ic.hasNext()) {
	    System.out.print(ic.next());
	}

    }

}
