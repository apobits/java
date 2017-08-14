/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author Administrador
 *
 */
public class ConstructorReferenceGeneric<T> {

	int number = 0;

	static interface Constructor<T> {
		ConstructorReferenceGeneric<T> generate(T i);
	}

	public <T>ConstructorReferenceGeneric(T t) {

	}

	public ConstructorReferenceGeneric(int i) {
		this.number = i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Constructor c = ConstructorReferenceGeneric::new;

		ConstructorReferenceGeneric cc = c.generate(1);
		System.out.println(cc.number);

	}

}
