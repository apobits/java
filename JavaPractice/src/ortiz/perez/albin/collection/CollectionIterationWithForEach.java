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
public class CollectionIterationWithForEach {

    private static Collection<Integer> getCollection() {
	Collection<Integer> c = new ArrayList<>();
	c.add(1);
	c.add(2);
	c.add(3);
	return c;
    }

    public static void main(String[] args) {
	Collection<Integer> c = getCollection();

	// iterates the collection
	c.forEach(t -> System.out.print(t));

	// iterates the collection and remove with predicate
	c.removeIf(t -> t == 2);

	System.out.println();

	// iterates the collection
	c.forEach(t -> System.out.print(t));

    }

}
