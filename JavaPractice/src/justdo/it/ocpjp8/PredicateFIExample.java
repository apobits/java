/**
 * 
 */
package justdo.it.ocpjp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author apobits@gmail.com
 *
 */
public class PredicateFIExample {

    public static void filter(List<Person> persons, Predicate<Person> p) {
	Iterator<Person> i = persons.iterator();
	while (i.hasNext()) {
	    if (p.test(i.next())) {
		i.remove();
	    }
	}
    }

    public static void main(String[] args) {
	List<Person> persons = new ArrayList<>();
	persons.add(new Person("Albin", "Perez", 1));
	persons.add(new Person("Danna", "Perez", 2));
	persons.add(new Person("Marcela", "Castro", 3));
	List<Person> p = Arrays.asList(new Person("Albin", "Perez", 1));
	// Calling filter method passing an anonymous class implementation of predicate
	// interface
	filter(persons, new Predicate<Person>() {

	    @Override
	    public boolean test(Person t) {
		return t.getId() == 1;
	    }
	});

	persons.forEach(x -> System.out.println(x));

    }

}
