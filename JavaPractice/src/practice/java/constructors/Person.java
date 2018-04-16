/**
 * 
 */
package practice.java.constructors;

/**
 * @author apobits@gmail.com
 *
 */
public class Person {

    private String name;

    private String lastName;

    public Person() {
	this("defaultName", "defaultLastName");
    }

    public Person(String name) {
	this(name, "defaultLastName");
    }

    public Person(String name, String lastName) {
	this.name = name;
	this.lastName = lastName;
    }

    @Override
    public String toString() {
	return name + " " + lastName;
    }

    public static void main(String args[]) {
	Person person = new Person();
	Person person1 = new Person("Albin");
	Person person2 = new Person("Albin", "Perez");
	System.out.println(person);
	System.out.println(person1);
	System.out.println(person2);
    }

}
