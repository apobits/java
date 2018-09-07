/**
 * 
 */
package justdo.it.ocpjp8;

/**
 * @author apobits@gmail.com
 *
 */
public class Person {

    private String name;

    private String lastName;

    private int id;

    public Person(String name, String lastName, int id) {
	this.name = name;
	this.lastName = lastName;
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return name + " " + lastName + " ";
    }
}
