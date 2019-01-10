/**
 * 
 */
package practice.java.methodReference;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author aposo
 *
 */
public class MethodReferenceExample implements Predicate<String> {

	public static void doSomething(Predicate<String> p) {
		System.out.println(p.test(""));
	}

	public static <T, U> void doSomethingElse(BiPredicate<T, U> bp, T t, U u) {
		System.out.println(bp.test(t, u));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Supplier<MethodReferenceExample> s = MethodReferenceExample::new;

		MethodReferenceExample m = s.get();

		// instance method reference
		doSomething(m::test);
		// static method reference
		doSomething(MethodReferenceExample::test1);
		// any instance method reference
		doSomethingElse(PredicateImpl::compare, new PredicateImpl(), new PredicateImpl());
		// instance method reference
		doSomethingElse(new PredicateImpl()::compare1, new PredicateImpl(), new PredicateImpl());

	}

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean test1(String s) {
		return false;
	}

}
