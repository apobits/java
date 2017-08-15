/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author aposo
 *
 */
public class FactoryMethod {

    static class A<T> {
	T t;

	public A(T t) {
	    this.t = t;
	}

	public A() {

	}
    }

    static class B {
	int i;

	public B(int i) {
	    this.i = i;
	}
    }

    static interface Factory<R, T> {
	R generate(T t);
    }

    static <R, T> R generateObject(Factory<R, T> factory, T t) {
	return factory.generate(t);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Factory<A<String>, String> f = A<String>::new;

	System.out.println(generateObject(f, "Albin").t);

	Factory<B, Integer> fg = B::new;

	System.out.println(generateObject(fg, 1).i);

	System.out.println(generateObject(x -> new B(x), 2).i);

    }

}
