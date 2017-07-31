/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class Throw {

    public void doSomething() throws Exception1 {
	throw new Exception1();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Throw t = new Throw();

	try {
	    t.doSomething();
	} catch (Exception1 e) {
	    e.printStackTrace();
	    System.out.println(e);
	}
    }

}
