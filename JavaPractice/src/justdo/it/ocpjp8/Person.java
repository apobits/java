/**
 * 
 */
package justdo.it.ocpjp8;

import java.io.Serializable;

/**
 * @author apobits@gmail.com
 *
 */
public class Person implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

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
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + lastName + " ";
	}
}
