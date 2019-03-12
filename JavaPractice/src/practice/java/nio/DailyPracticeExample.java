/**
 * 
 */
package practice.java.nio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 *
 */
public class DailyPracticeExample {

	static class Collector implements Consumer<Integer> {

		int count;

		int sum;

		public double getAverage() {
			return ((double) sum) / count;
		}

		@Override
		public void accept(Integer t) {
			sum += t;
			count++;
		}

		public void combiner(Collector t) {
			
		}

	}

	public static void main(String[] args) throws Exception {

		List<Person> persons = Arrays.asList(new Person("Albin", "Perez", 16055133, 37),
				new Person("Danna", "Perez", 1055751348, 14), new Person("Lina", "Marcela", 24347671, 38),
				new Person("Nidia", "Ortiz", 24835353, 70), new Person("Judith", "Ortiz", 24835550, 65),
				new Person("Silvio", "Perez", 4474978, 63), new Person("Bryan", "Perez", 12345675, 18),
				new Person("Hasley", "Perez", 12345676, 40), new Person("Winder", "Perez", 12345677, 32),
				new Person("Robinson", "Perez", 12345678, 30));

		System.out.println("Average age is: " + persons.stream().mapToDouble(t -> t.getAge()).average().getAsDouble());

		System.out.println("Sum age is: " + persons.stream().map(t -> t.getAge()).reduce(0, (t, u) -> t + u));

		System.out.println("Average age is: " + persons.stream().map(t -> t.getAge())
				.collect(Collector::new, Collector::accept, Collector::combiner).getAverage());

	}

}
