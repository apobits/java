/**
 * 
 */
package practice.java.nio;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		var persons = Stream.of(new Person("Albin", "Perez", 16055133, 37),
				new Person("Danna", "Perez", 1055751348, 14), new Person("Marcela", "Castro", 24347671, 38),
				new Person("Bryan", "Perez", 1111111, 19), new Person("Nidia", "Ortiz", 24835353, 70),new Person("Albin", "Perez", 16055133, 37));

		var personsMap = persons
				.collect(Collectors.toMap(Person::getName, t -> Collections.singleton(t), (t, s) -> {var linkedList = new HashSet<>(t);linkedList.addAll(s);return linkedList;}, TreeMap::new));
		System.out.println(personsMap);

	}
}
