/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author Administrador
 *
 */
public class ConstructorReferenceGeneric<T> {

    T number;

    static interface Constructor<T> {
	ConstructorReferenceGeneric<T> generate(T i);
    }

    public ConstructorReferenceGeneric(T t) {
	this.number = t;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	Constructor<Integer> c = ConstructorReferenceGeneric<Integer>::new;

	ConstructorReferenceGeneric<Integer> cc = c.generate(1);
	System.out.println(cc.number);

    }

}
