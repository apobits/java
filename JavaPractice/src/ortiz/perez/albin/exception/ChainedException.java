/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class ChainedException {

    public static void main(String args[]) {

	try {
	    Exception1 e1 = new Exception1();

	    Exception2 e2 = new Exception2();

	    e1.initCause(e2);

	    throw e1;
	} catch (Exception1 e) {
	    System.out.println(e);
	    System.out.println(e.getCause());
	}
    }

}
