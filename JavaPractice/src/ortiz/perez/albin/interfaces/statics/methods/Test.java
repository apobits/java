/**
 * 
 */
package ortiz.perez.albin.interfaces.statics.methods;

/**
 * @author Administrador
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceA a = new ClassA();
		// static methods are not implemented by classes

		// static methods in interfaces are accessed directly. example
		// InterfaceA.saySomething()
		InterfaceA.saySomething();
	}

}
