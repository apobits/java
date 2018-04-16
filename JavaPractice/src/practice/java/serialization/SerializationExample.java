/**
 * 
 */
package practice.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author apobits@gmail.com
 *
 */
public class SerializationExample {

    static class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;

	/**
	 * @return the name
	 */
	public String getName() {
	    return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
	    return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	@Override
	public String toString() {
	    return "Name=" + name + " LastName=" + lastName;
	}

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	try (ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream("C:\\Users\\Administrador\\Desktop\\mypackage\\Person.java"));
		ObjectInputStream ois = new ObjectInputStream(
			new FileInputStream("C:\\Users\\Administrador\\Desktop\\mypackage\\Person.java"))) {

	    Person p1 = new Person();
	    p1.setName("Albin");
	    p1.setLastName("Perez");

	    oos.writeObject(p1);// writes the serialized object to the outputstream

	    Person p2 = (Person) ois.readObject();// reads the serialized object from the inputstream

	    System.out.println("object p1 " + p1.toString());
	    System.out.println("object p2 " + p2.toString());

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
