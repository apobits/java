/**
 * 
 */
package practice.java.nio;

import java.util.Arrays;
import java.util.stream.Collectors;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {

		var personsList = Arrays.asList(new Person("Albin", "Perez", 16055133, 37),
				new Person("Danna", "Perez", 1055751348, 14), new Person("Marcela", "Castro", 24347671, 38),
				new Person("Bryan", "Perez", 1111111, 19), new Person("Nidia", "Ortiz", 24835353, 70));

		var avg =  personsList.stream().mapToInt(t-> t.getAge()).summaryStatistics().andThen(t->System.out.println(t));
		avg.accept(0);
	}
}
