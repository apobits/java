/**
 * 
 */
package practice.java.nio;

import java.util.List;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	public static void main(String args[]) {
		var personList = List.of(new Person("Albin", "Perez", 1, 37), new Person("Albin", "Perez", 1, 37));
		System.out.println(personList.stream().mapToInt(p -> p.getAge()).reduce((t, u) -> t + u).getAsInt());
	}
}
