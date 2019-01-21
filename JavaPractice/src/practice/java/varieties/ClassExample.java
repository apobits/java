/**
 * 
 */
package practice.java.varieties;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ortiz.perez.albin.interfaces.PublicInterface;
import practice.java.accessControl.Animal;
import practice.java.annotation.OwnAnnotation;

/**
 * @author apobits@gmail.com
 *
 */
@OwnAnnotation(name = "Test")
public class ClassExample extends Animal implements Cloneable {

	private String privateField;

	public String publicField;

	public interface TestInterface {

	}

	public class TestClass {

	}

	public void doSomething() {

	}

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) {
		ClassExample classExample = new ClassExample();

		try {
			// ways of obtaining a class object of a type
			Class<?> clazz = Class.forName("practice.java.varieties.ClassExample");
			Class<?> clazz1 = ClassExample.class;
			Class<?> clazz2 = classExample.getClass();

			// getting annotation used in the class from an specific type
			Annotation annotation = clazz.getAnnotation(OwnAnnotation.class);
			System.out.println(((OwnAnnotation) annotation).name());

			// get annotations used in the class
			Annotation[] annotations = clazz1.getAnnotations();
			for (Annotation x : annotations) {
				System.out.println(x);
			}

			// get annotations used in the class by type
			OwnAnnotation[] ownAnnotationArray = clazz2.getAnnotationsByType(OwnAnnotation.class);
			for (OwnAnnotation x : ownAnnotationArray) {
				System.out.println(x);
			}

			// get classes and interfaces objects that are public members of the invoking
			// object
			Class<?>[] classes = clazz2.getClasses();
			for (Class<?> x : classes) {
				System.out.println(x);
			}

			// get the class loader
			ClassLoader cl = clazz.getClassLoader();
			System.out.println(cl);

			// get the default constructor
			Constructor<Object> constructor = (Constructor<Object>) clazz.getConstructor();

			// creates an object of the class ClassExample from the constructor obtained in
			// the previous step
			ClassExample fromConstructor = (ClassExample) constructor.newInstance();
			System.out.println(fromConstructor.canFly);

			// get declared annotations that are directly present on the class, it does not
			// get inherited annotations
			Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
			for (Annotation x : declaredAnnotations) {
				System.out.println("Declared annotation " + x);
			}

			// get declared constructors that are directly present on the class, it does not
			// get superclass constructors
			Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
			for (Constructor<?> x : declaredConstructors) {
				System.out.println("Declared constructor " + x);
			}

			// get declared methods, it excludes inherited ones
			Method[] declaredMethods = clazz.getDeclaredMethods();
			for (Method x : declaredMethods) {
				System.out.println("Declared method " + x);
			}

			// get public fields including inherited ones
			Field[] fields = clazz.getFields();
			for (Field x : fields) {
				System.out.println(x);
			}

			// get field by name
			Field field = clazz.getField("publicField");
			System.out.println(field);

			// get interfaces on class
			Class<?>[] interfacesOnClass = clazz.getInterfaces();
			for (Class<?> x : interfacesOnClass) {
				System.out.println("Interface on class " + x);
			}

			// get interfaces on interface
			Class<?>[] interfacesOnInterface = PublicInterface.class.getInterfaces();
			for (Class<?> x : interfacesOnInterface) {
				System.out.println("Interface on interface " + x);
			}

			// get methods including the inherited ones
			Method[] methods = clazz.getMethods();
			for (Method x : methods) {
				System.out.println("Method " + x);
			}

			// get method
			Method method = clazz.getMethod("doSomething");
			System.out.println("Method " + method);

			// get name
			System.out.println("Class name " + clazz.getName());

			// get protection domain
			System.out.println("Protection domain " + clazz.getProtectionDomain());

			// gets the superclass
			System.out.println("Superclass " + clazz.getSuperclass());

			// check if the class is an interface or not
			System.out.println("Is interface " + clazz.isInterface());

			// creates a new instance from a class object, if class object is not a class or
			// does not have a default constructor an exception of type
			// InstantiationException will be thrown
			ClassExample newInstanceClassExample = (ClassExample) clazz.newInstance();
			newInstanceClassExample.fly();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
