/**
 * 
 */
package practice.java.nio;

import java.io.IOException;
import java.lang.reflect.Field;

import practice.java.varieties.Person;

/**
 * @author apobits@gmail.com
 * 
 *
 */

class DailyPracticeExample {

	public static void main(String args[]) throws IOException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Person person = new Person("Albin", "Perez");
		Field[] fields = person.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.get(person));
		}
	}
}
