/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author aposo
 *
 */
public class ArrayConstructorReference {

    static class A {

    }

    static interface Factory<T> {
	T generate(int t);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Factory<A[]> f = A[]::new;
	A[] a = f.generate(2);
	a[0] = new A();
	a[1] = new A();
	System.out.println(a.length);

    }

}
