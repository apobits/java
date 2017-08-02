/**
 * 
 */
package ortiz.perez.albin.enums;

/**
 * @author Administrador
 *
 */
public enum B {

	A("a"), B("b"), C("c");

	private String lowerCase;

	private B(String value) {
		lowerCase = value;
	}

	public String getLowerCase() {
		return lowerCase;
	}

}
