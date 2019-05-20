/**
 * 
 */
package practice.java.varieties;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author aposo
 *
 */
public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// raw type, first way to get a Class object
		Class v = Class.forName("java.lang.Thread");

		// second way to get a Class object
		Class<Thread> threadClass = Thread.class;

		// third way to get a Class object
		Class<?> threadClass1 = new Thread().getClass();

		Runnable runnable = () -> {
			System.out.println("Executed by reflection");
		};

		Constructor<Thread> threadConstructor = threadClass.getConstructor(Runnable.class);

		Thread thread1 = threadConstructor.newInstance(runnable);

		thread1.start();

		Class<int[]> intArrayClass = int[].class;

		Class<Double[]> doubleArrayClass = Double[].class;

		try (InputStream is = ReflectionExample.class.getResourceAsStream("Text.txt")) {
			int byt3 = -1;
			while ((byt3 = is.read()) != -1) {
				System.out.print((char) byt3);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
