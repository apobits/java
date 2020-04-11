/**
 *
 */
package practice.java.generic;

import java.util.HashMap;
import java.util.List;

/**
 * @author aposo
 *
 */
public class GenericExample<T, S, U> {

    // non static field can be generic
    private T t;

    public static <S> void doSomethingElse(S s) {

    }

    // Generic static fields are not allowed
    //	public static T t;

    // static methods can not use generic parameters if the methods itself are not
    // generic
    //	public static void doSomething(T t) {
    //
    //	}

    public static void main(String[] args) {

	// type inference
	// <> diamond
	GenericExample<String, String, Integer> ge = new GenericExample<>();

	// using var
	GenericExample<String, String, Integer> ge1 = new GenericExample<String, String, Integer>();

	doSomethingElse(Integer.valueOf(1));

	// using parameterized types as type parameter
	HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();

	// raw type
	ge = new GenericExample();

	// type inference
	GenericMethodExample.doSomething(ge);

	// defining type arguments explicitly
	GenericMethodExample.<String, String, Integer>doSomething(ge);

    }

    // non static method can use generic parameter
    public void doSomething(T t) {

    }

}
