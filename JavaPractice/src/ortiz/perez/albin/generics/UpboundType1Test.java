/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class UpboundType1Test {

    /**
     * @param args
     */
    public static void main(String[] args) {

	UpboundType1<E> e = new UpboundType1<>();// subclasses of the generic type parameter are legal

	//UpboundType1<C> c = new UpboundType1<>();// superclasses of the generic type parameter are illegal

    }

}
