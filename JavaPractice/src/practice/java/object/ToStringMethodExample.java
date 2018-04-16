/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
public class ToStringMethodExample {

    @Override
    public String toString() {
	return "toString() method overridden, this must contain useful information about the object";
    }

    public static void main(String[] args) {
	ToStringMethodExample obj = new ToStringMethodExample();
	System.out.println(obj.toString());
    }

}
