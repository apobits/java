/**
 * 
 */
package ortiz.perez.albin.finalx;

/**
 * @author Administrador
 *
 */
public class B {

	public final String hi = "hi";

	// msg parameter cannot be modified
	// final method can not be overridden when inherited
	public final void doSomething(final String msg) {
		System.out.println(msg);
	}

}
