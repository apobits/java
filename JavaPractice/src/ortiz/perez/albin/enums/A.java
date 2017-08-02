/**
 * 
 */
package ortiz.perez.albin.enums;

/**
 * @author Administrador
 *
 */
public enum A {

	A("a"), B("b"), C("c");

	private String lowerCase;

	private A(String value) {
		lowerCase = value;
	}

	public String getLowerCase() {
		return lowerCase;
	}

}
