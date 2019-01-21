/**
 * 
 */
package practice.java.varieties;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author aposo
 *
 */
public class TransientExample implements Serializable {

	private static final long serialVersionUID = 1L;

	int a;

	transient private Person p;

	transient int b;

	public TransientExample(int a, int b) {
		this.a = a;
		this.b = b;
		setP(new Person("Albin", "Perez"));
	}

	@Override
	public String toString() {
		return "a = " + a + " b = " + b + " " + p;
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		TransientExample c = new TransientExample(1, 2);

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java"));
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("C:\\Users\\Administrador\\Desktop\\test\\serialized.java"))) {
			System.out.println("before serialization " + c);

			oos.writeObject(c);
			oos.flush();

			TransientExample d = (TransientExample) ois.readObject();
			System.out.println("after serialization " + d);

		}

	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}
