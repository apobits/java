/**
 * 
 */
package practice.java.overriddingdefaultmethods;

/**
 * @author apobits@gmail.com
 *
 */
public class DAImplementor implements D, A {

    /**
     * @param args
     */
    public static void main(String[] args) {
	A a = new DAImplementor();
	a.method1();

    }

}
