/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class ClonePerson {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("Albin", "Perez");
		Person person2 = (Person) person.clone();

		System.out.println("person " + person);
		System.out.println("person2 " + person2);
		

	}

}
