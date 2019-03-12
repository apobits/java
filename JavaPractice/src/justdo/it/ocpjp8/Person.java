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

	private int age;

	private String gender;

	public Person(String name, String lastName, int id, int age) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

	public Person(String name, String lastName, int id, int age, String gender) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
		this.gender = gender;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + lastName + " ";
	}

}
