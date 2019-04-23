/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author aposo
 *
 */
public class Q61 {

	static class Person {
		private String name;

		public Person(String name) {
			this.setName(name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Stream<List<Person>> perStream = Stream.of(Arrays.asList(new Person("Jack"), new Person("Jane")),
				Arrays.asList(new Person("John")), Arrays.asList(new Person("Tom"), new Person("Tim")));
		Stream<Person> persons = perStream.flatMap(t -> t.stream());
		persons.forEach(t -> System.out.print(t.getName() + " "));
	}

}
