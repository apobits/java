/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class ManyTypeParameter<T, V> {

    public ManyTypeParameter(T t, V v) {
	System.out.print(t.getClass().getName() + " " + v.getClass().getName());
    }

}
