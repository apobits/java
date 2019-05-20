/**
 * 
 */
package practice.java.varieties;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author aposo
 *
 */
public class ReflectionExample {

	private int a = 5;

	public static void printMethods() {
		Method[] methods = ReflectionExample.class.getMethods();

		Arrays.stream(methods).forEach(t -> System.out.println(t));
	}

	public static void printFields() {
		Field[] fields = ReflectionExample.class.getFields();

		Arrays.stream(fields).forEach(t -> System.out.println(t));
	}

	public static void printFieldsValues() {
		// getDeclaredFields returns all the public and non public fields
		// getFields returns all public fields
		Field[] fields = ReflectionExample.class.getDeclaredFields();

		Arrays.stream(fields).forEach(t -> {
			try {
				var obj = new ReflectionExample();
				t.setAccessible(true);
				System.out.println(t.get(obj));
				t.set(obj, 10);
				System.out.println(t.get(obj));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public static void getField() {
		try {
			Field a = ReflectionExample.class.getField("a");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void getMethod() {
		try {
			Method printMethods = ReflectionExample.class.getMethod("printMethods");
			printMethods.invoke(null);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getConstructor() {
		try {
			Constructor<ReflectionExample> constructor = ReflectionExample.class.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printArrayElements() {
		int[] numbers = { 1, 2, 3 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(Array.get(numbers, i));
		}

		int x[] = (int[]) Array.newInstance(int.class, 5);

		x[4] = 4;

		System.out.println(x[4]);
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		getMethod();

		System.exit(0);

		printArrayElements();

		System.exit(0);

		printFieldsValues();

		System.exit(0);

		printMethods();

		System.exit(0);
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

	}

}
