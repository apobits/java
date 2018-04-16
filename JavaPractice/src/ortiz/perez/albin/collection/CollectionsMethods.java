/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author Administrador
 *
 */
public class CollectionsMethods {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>();
		s.add(1);
		s.add(5);
		s.add(3);

		System.out.println(s);
		Collections.checkedSet(s, Integer.class);// type safe view
		Collection<Integer> view = Collections.unmodifiableSet(s);// unmodifiable
																	// view
		//view.add(2);// error throw at runtime because the view is unmodifiable
		System.out.println(Collections.max(s));
	}

}
