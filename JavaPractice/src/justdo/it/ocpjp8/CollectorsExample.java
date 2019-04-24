/**
 * 
 */
package justdo.it.ocpjp8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author apobits@gmail.com
 *
 */
public class CollectorsExample {

	private static List<Person> persons = Arrays.asList(new Person("Albin", "Perez", 1, 37),
			new Person("Danna", "Perez", 2, 14), new Person("Marcela", "Castro", 3, 38));

	public static void partitioningBy() {

		Map<Boolean, List<Person>> pb = persons.stream()
				.collect(Collectors.partitioningBy(t -> t.getLastName().equals("Perez")));
		System.out.println(pb);

		Map<Boolean, List<Integer>> pbs = persons.stream().collect(Collectors.partitioningBy(
				(t -> t.getLastName().equals("Perez")), Collectors.mapping(t -> t.getId(), Collectors.toList())));

		System.out.println(pbs);

	}

	public static void groupingBy() {
		Map<String, List<Person>> gb = persons.stream().collect(Collectors.groupingBy(t -> t.getLastName()));
		System.out.println(gb);

		Map<String, Map<Integer, List<Person>>> gbb = persons.stream()
				.collect(Collectors.groupingBy(t -> t.getLastName(), Collectors.groupingBy(t -> t.getAge())));

		System.out.println(gbb);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		groupingBy();
		System.exit(1);
		partitioningBy();
	}

}
