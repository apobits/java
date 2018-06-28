/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author apobits@gmail.com
 *
 */
public class MultiCatch {
    
    public void test() throws Exception1,Exception2 {
	
    }
    
    public void callTest() {
	try {
	    test();
	} catch (Exception1 | Exception2 e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
