/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q21 {

	static class Person {
		private String firstName;
		private int salary;

		public Person(String firstName, int salary) {
			this.firstName = firstName;
			this.salary = salary;
		}

		public String getFirstName() {
			return firstName;
		}

		public int getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {

		List<Person> prog = Arrays.asList(new Person("Smith", 1500), new Person("John", 2000), new Person("Joe", 1000));

		double dVal = prog.stream().filter(t -> t.getFirstName().startsWith("J")).mapToInt(Person::getSalary).average()
				.getAsDouble();

		System.out.println(dVal);

	}

}
