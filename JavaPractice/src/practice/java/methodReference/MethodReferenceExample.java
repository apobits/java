/**
 * 
 */
package practice.java.methodReference;

import java.util.function.Predicate;

/**
 * @author aposo
 *
 */
public class MethodReferenceExample implements Predicate<String> {

	public static void doSomething(Predicate<String> p) {
		p.test("");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doSomething(new MethodReferenceExample()::test);

	}

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
