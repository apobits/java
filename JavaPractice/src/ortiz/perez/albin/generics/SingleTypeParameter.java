/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class SingleTypeParameter<T> {

    private T type;

    public SingleTypeParameter(T type) {
	this.type = type;
	System.out.println(type.getClass().getName());
    }

}
