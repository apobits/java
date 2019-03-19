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
		private int age;
		private Phone phone;

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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Phone getPhone() {
			return phone;
		}

		public void setPhone(Phone phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Name=" + name + " LastName=" + lastName + " age=" + age + " phone=" + phone;
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
			p1.setAge(7);
			p1.setPhone(new Phone(8917675, 576));

			oos.writeObject(p1);// writes the serialized object to the outputstream

			Person p2 = (Person) ois.readObject();// reads the serialized object from the inputstream

			System.out.println("object p1 " + p1.toString());
			System.out.println("object p2 " + p2.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
