/**
 * 
 */
package practice.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author apobits@gmail.com
 *
 */
public class ObjectOrderingExample {

	static class Person implements Comparable<Person> {

		private int id;

		private String name;

		public Person(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public int compareTo(Person o) {
			return id - o.id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static void comparableInterface() {

		List<Person> personsL = new ArrayList<>();

		personsL.add(new Person(1, "Danna"));
		personsL.add(new Person(2, "Marcela"));
		personsL.add(new Person(4, "Aunt"));
		personsL.add(new Person(3, "Albin"));

		Set<Person> personsS = new TreeSet<>(personsL);

		System.out.println("Unordered list of persons ");
		personsL.forEach(t -> System.out.print(t.name + " "));

		System.out.println("\n\rSet of persons ordered by its natural order");
		personsS.forEach(t -> System.out.print(t.name + " "));

		Collections.sort(personsL);
		System.out.println("\n\rOrdered list of persons");
		personsL.forEach(t -> System.out.print(t.name + " "));

	}

	public static void comparatorInterface() {

		List<Person> personsL = new ArrayList<>();
		personsL.add(new Person(1, "Danna"));
		personsL.add(new Person(2, "Marcela"));
		personsL.add(new Person(4, "Aunt"));
		personsL.add(new Person(3, "Albin"));
		personsL.add(new Person(5, "Albin"));

		Collections.sort(personsL, (t, u) -> u.name.compareTo(t.name));

		System.out.println("Iterating person List");
		personsL.forEach(t -> System.out.print(t.name + " "));

		TreeSet<Person> personsS = new TreeSet<>((t, u) -> u.name.compareTo(t.name));

		personsS.addAll(personsL);

		System.out.println();
		System.out.println("Iterating person Set");
		personsS.forEach(t -> System.out.print(t.name + " "));

	}

	public static void main(String[] args) {
//		comparableInterface();
		comparatorInterface();
	}

}
