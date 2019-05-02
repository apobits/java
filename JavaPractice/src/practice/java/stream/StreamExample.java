/**
 * 
 */
package practice.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 *
 */
public class StreamExample {

	static List<Person> persons = Arrays.asList(new Person("Albin", "Perez", 16055133, 37, "Male"),
			new Person("Danna", "Perez", 1055751348, 14, "Female"),
			new Person("Lina", "Marcela", 24347671, 38, "Female"), new Person("Nidia", "Ortiz", 24835353, 70, "Female"),
			new Person("Judith", "Ortiz", 24835550, 65, "Female"), new Person("Silvio", "Perez", 4474978, 63, "Male"),
			new Person("Bryan", "Perez", 12345675, 18, "Male"), new Person("Hasley", "Perez", 12345676, 40, "Male"),
			new Person("Winder", "Perez", 12345677, 32, "Male"), new Person("Robinson", "Perez", 12345678, 30, "Male"));

	private static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	private static List<List<Integer>> integerss = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
			Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

	public static void reduce() {
		System.out.println(integers.stream().reduce(-1, (t, u) -> t + u));
	}

	public static void max() {
		System.out.println(integers.stream().max((t, u) -> t - u));
	}

	public static void flatMap() {
		integerss.stream().flatMap(t -> t.stream()).forEach(t -> System.out.print(t + " "));

		Stream<Integer> temp = integerss.stream().flatMap(t -> t.stream());

		temp.forEach(t -> System.out.print(t + " "));
		System.out.println();
		integerss.stream().forEach(t -> System.out.print(t + " "));
	}

	public static void allMatch() {
		System.out.println(integers.stream().allMatch(t -> t > 0));
	}

	public static void anyMatch() {
		System.out.println(integers.stream().anyMatch(t -> t == 1));
	}

	public static void modifyingSource() {
		List<StringBuilder> list = new ArrayList<>();
		list.add(new StringBuilder());
		list.stream().forEach(t -> t.append("Hello"));
		list.stream().forEach(t -> System.out.println(t));
	}

	public static void streamBuilder() {
		Builder<Integer> b = Stream.builder();
		b.add(2);
		b.add(5);
		b.add(3);
		System.out.println(b.build().reduce((t, u) -> t + u));
	}

	public static void collect() {

		persons.stream().map(t -> t.getName()).collect(Collectors.toList());

		List<String> names = persons.stream().map(t -> t.getName()).collect(Collectors.toList());

		System.out.println(names);

		Map<String, List<Person>> groupedPersons = persons.stream().collect(Collectors.groupingBy(t -> t.getGender()));

		Map<String, List<String>> groupedPersonss = persons.stream().collect(
				Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));

		Map<String, Integer> sums = persons.stream().collect(
				Collectors.groupingBy(Person::getGender, Collectors.reducing(0, Person::getAge, Integer::sum)));

		System.out.println(groupedPersons.get("Male"));

		System.out.println(groupedPersons.get("Female"));

		System.out.println(groupedPersonss.get("Male"));

		System.out.println(groupedPersonss.get("Female"));

		System.out.println(sums.get("Male"));

		System.out.println(sums.get("Female"));

	}

	public static void parallelStream() {
		System.out.println("Printed with a serial stream: ");
		integers.stream().forEach(t -> System.out.print(t + " "));

		System.out.println("\nPrinted with a parallel stream: ");
		integers.parallelStream().forEach(t -> System.out.print(t + " "));
	}

	public static void average() {
		System.out.println(DoubleStream.of(30.0, 20.0).average().getAsDouble());

		System.out.println(persons.stream().mapToInt(Person::getAge).average().getAsDouble());
	}

	public static void peek() {
		integers.stream().peek(t -> System.out.println(t));
	}

	public static void limit() {
		System.out.println(persons);
		System.out.println();
		persons.stream().limit(5).forEach(t -> System.out.print(t + " "));
	}

	public static void skip() {
		System.out.println(persons);
		System.out.println();
		persons.stream().skip(5).forEach(t -> System.out.print(t + " "));
	}

	public static void iterator() {
		Iterator<Integer> numbers = integers.stream().iterator();

		while (numbers.hasNext()) {
			System.out.print(numbers.next() + " ");
		}
	}

	public static void spliterator() {
		Spliterator<Integer> numbers = integers.stream().spliterator();
		numbers.forEachRemaining(t -> System.out.print(t + " "));
	}

	public static void takeWhile() {
		System.out.println(integers);
		System.out.println();
		integers.stream().sorted((t, u) -> u.compareTo(t)).takeWhile(t -> t > 5)
				.forEach(t -> System.out.print(t + " "));
	}

	public static void dropWhile() {
		System.out.println(integers);
		System.out.println();
		integers.stream().dropWhile(t -> t < 5).forEach(t -> System.out.print(t + " "));
	}

	public static void ofNullable() {
		System.out.print("Stream of nullable with 1 as parameter: ");
		Stream.ofNullable(1).forEach(t -> System.out.print(t + " "));
		System.out.println();
		System.out.println("Stream of nullable with null as parameter: ");
		Stream.ofNullable(null).forEach(t -> System.out.print(t + " "));
	}

	public static void iterate() {
		Stream.iterate(0, t -> t + 1).forEach(t -> System.out.println(t));
		Stream.iterate(0, t -> t < 5, t -> t + 1).forEach(t -> System.out.println(t + " "));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		iterate();
	}

}
