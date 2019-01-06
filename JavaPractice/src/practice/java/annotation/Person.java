/**
 * 
 */
package practice.java.annotation;

import java.lang.annotation.Annotation;

/**
 * @author aposo
 *
 */
@OwnAnnotation(name = "Albin class")
//SingleValueAnnotation
@SingleValueAnnotation("Albin")
//Single value annotation with default values
@DefaultValueAnnotation("Albin")
//Default value annotation
@DefaultValueAnnotation2
//Repeating own annotation
@OwnAnnotation(name = "Danna")

public class Person<@TypeParameterAnnotation T> {

	public @FieldAnnotation String name;

	public @TypeUsageAnnotation Integer doSomething(String word) {

		return 1;
	}

	public @MethodAnnotation Integer doSomethingElse() {

		return 2;
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		@LocalVariableAnnotation Person  person = new Person();

		Class<?> personClass = person.getClass();

		for (Annotation a : personClass.getAnnotations()) {

			System.out.println(a);
		}

		// getting repeatable annotation OwnAnnotation
		OwnAnnotationContainer oac = personClass.getAnnotation(OwnAnnotationContainer.class);
		for (OwnAnnotation o : oac.value()) {
			System.out.println(o);
		}

	}

}
