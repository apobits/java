/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author Administrador
 *
 */
public class ConstructorReference {

	int number = 0;

	static interface Constructor {
		ConstructorReference generate(int i);
	}

	public ConstructorReference() {

	}

	public ConstructorReference(int i) {
		this.number = i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Constructor c = ConstructorReference::new;

		ConstructorReference cc = c.generate(1);
		System.out.println(cc.number);

	}

}
