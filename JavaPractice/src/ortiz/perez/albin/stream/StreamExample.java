/**
 * 
 */
package ortiz.perez.albin.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author Administrador
 *
 */
public class StreamExample {

    static class Person {
	String name;
	int age;

	public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	}
    }

    private static Collection<Person> getCollection() {
	Collection<Person> persons = new ArrayList<>();
	persons.add(new Person("Albin", 1));
	persons.add(new Person("Danna", 2));
	persons.add(new Person("Lina", 3));
	persons.add(new Person("Marcela", 4));
	return persons;
    }

    public static void main(String[] args) {

	Integer a[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9 };
	Stream<Integer> s = Arrays.stream(a);// Stream is a sequence of elements
					     // that support a sequential and
					     // aggregate operation
	s.filter(t -> t < 6)// filters according to the predicate function
		.forEach(t -> System.out.print(t));//

	Collection<Person> persons = getCollection();
	persons.stream().filter(t -> !t.name.equals("Albin")).forEach(t -> System.out.println(t.name));

    }

}
