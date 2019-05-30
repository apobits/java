/**
 * 
 */
package practice.java.generic;

import practice.java.varieties.Person;

/**
 * @author aposo
 *
 */
//Upper bound, if bounding to a class this class must be the first element and interfaces go next separated by &
public class UpperBoundExample<T extends Person & Comparable<Person> & Cloneable> {

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
