/**
 * 
 */
package practice.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import justdo.it.ocpjp8.Person;

/**
 * @author apobits@gmail.com
 *
 */
public class ObjectStreamExample {

	public static void main(String[] args) {

		// when using ObjectInputStream, objects that are written to it and then
		// recovered will have different objects references than those that were
		// persisted
		// if you are persisting the same object twice the stream will maintain only one
		// copy of it

		Person person = null, person1 = null;
		try {
			person = new Person("Albin", "Perez", 1);
			person1 = (Person) person.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println();
			System.exit(1);
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java")))) {
			oos.writeObject(person);
			oos.writeObject(person);
		} catch (IOException e) {
			System.out.println(e);
		}

		try (ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java")))) {
			Person object = (Person) dis.readObject();
			Person object1 = (Person) dis.readObject();
			System.out.println("Object is equal to object1 ? " + (object == object1));
			System.out.println(object);

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
