/**
 * 
 */
package practice.java.varieties;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author apobits@gmail.com
 *
 */
public class ComparatorExample {

	public static void thenComparing() {
		Comparator<Person> nameComparator = (t, u) -> t.getName().compareTo(u.getName());

		Comparator<Person> lastNameComparator = (t, u) -> t.getLastName().compareTo(u.getLastName());

		TreeSet<Person> person = new TreeSet<>(lastNameComparator.thenComparing(nameComparator));

		person.add(new Person("Albin", "Perez"));

		person.add(new Person("Danna", "Perez"));

		person.add(new Person("Marcela", "Castro"));

		System.out.println(person);

		// other way to sort by lastName and name using the default method thenComparing
		// obtaining a key and a comparator
		TreeSet<Person> persons = new TreeSet<>(
				lastNameComparator.thenComparing(t -> t.getName(), (t, u) -> t.compareTo(u)));

		persons.add(new Person("Albin", "Perez"));

		persons.add(new Person("Danna", "Perez"));

		persons.add(new Person("Marcela", "Castro"));

		System.out.println(persons);

	}

	public static void comparingInt() {
		Comparator<Integer> integerComparator = Comparator.comparingInt(t -> (int) t);

		System.out.println(integerComparator.compare(1, 2));

		TreeSet<Integer> numbers = new TreeSet<>(integerComparator);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);

		System.out.println(numbers);

		TreeSet<Integer> numbersReversed = new TreeSet<>(integerComparator.reversed());
		numbersReversed.add(2);
		numbersReversed.add(1);
		numbersReversed.add(3);

		System.out.println(numbersReversed);
	}

	public static void nullComparators() {
		Comparator<Integer> comparatorLast = Comparator.nullsLast(null);

		Comparator<Integer> comparatorFirst = Comparator.nullsFirst(null);
	}

	public static void main(String[] args) {
		comparingInt();
	}

}
