/**
 * 
 */
package practice.java.generic;

import practice.java.varieties.Person;

/**
 * @author aposo
 *
 */
//Upper bound 
public class UpperBoundExample<T extends Person & Comparable<Person>> {

	public void print(T t) {
		System.out.println(t.getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UpperBoundExample<Person> test = new UpperBoundExample<>();
		test.print(new Person("Albin", "Perez"));

	}

}
