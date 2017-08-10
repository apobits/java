/**
 * 
 */
package ortiz.perez.albin.constructor_this;

/**
 * @author aposo
 *
 */
public class ATest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	A a = new A("Albin", "Perez");// Normal use of the constructor
				      // Normal version improves runtime object creation performance

	A b = new A();// Using this to call the constructor with parameters from the constructor with no parameters
		      // this version improves class load performance

    }

}
