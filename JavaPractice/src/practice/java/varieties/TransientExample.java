/**
 * 
 */
package practice.java.varieties;

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

	transient int b;

	public TransientExample(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "a = " + a + " b = " + b;
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		TransientExample c = new TransientExample(1, 2);

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\aposo\\Desktop\\test\\serialized.java"));
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("C:\\Users\\aposo\\Desktop\\test\\serialized.java"))) {
			System.out.println("before serialization " + c);

			oos.writeObject(c);
			oos.flush();

			TransientExample d = (TransientExample) ois.readObject();
			System.out.println("after serialization " + d);

		}

	}

}
