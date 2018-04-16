/**
 * 
 */
package ortiz.perez.albin.comparator;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Administrador
 *
 */
public class ComparatorExample {

	static class ComparatorImp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;

		}

	}

	static class Person {
		String name;
		String lastName;

		public Person(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}

		public String toString() {
			return this.name + " " + this.lastName;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> c = new TreeSet<>(new ComparatorImp());

		c.add(1);
		c.add(2);
		System.out.println(c);

		Comparator<Person> name = ((t, u) -> {
			return t.name.charAt(0) - u.name.charAt(0);
		});
		Comparator<Person> lName = ((t, u) -> {
			return t.lastName.charAt(0) - u.lastName.charAt(0);
		});
		Collection<Person> persons = new TreeSet<>(name.thenComparing(lName));
		persons.add(new Person("Albin", "Perez"));
		persons.add(new Person("Danna", "Perez"));
		persons.add(new Person("Lina", "Castro"));
		persons.add(new Person("Albin", "Castro"));
		System.out.println(persons);
	}

}
