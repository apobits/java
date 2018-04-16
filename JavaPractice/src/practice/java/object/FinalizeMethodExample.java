/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
public class FinalizeMethodExample {

    // this method MAY be called by the garbage collector so it must no be used to
    // release resources
    @Override
    protected void finalize() throws Throwable {
	System.out.println("finalize method called");
    }

    public static void main(String[] args) throws InterruptedException {
	FinalizeMethodExample f = new FinalizeMethodExample();
	Thread.sleep(10000);
    }

}
