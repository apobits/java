/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class ManyTypeParameter3<A, B, C> {
    public ManyTypeParameter3(A a, B b, C c) {
	System.out.println(a.getClass().getName());
	System.out.println(b.getClass().getName());
	System.out.println(c.getClass().getName());
    }
}
