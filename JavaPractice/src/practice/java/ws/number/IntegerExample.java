/**
 * 
 */
package practice.java.ws.number;

/**
 * @author apobits@gmail.com
 *
 */
public class IntegerExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	// pointing to the same memory location
	Integer a = 1;
	Integer b = 1;

	// pointing to different memory locations but with cache benefits
	Double c = Double.valueOf(1);
	Double cc = Double.valueOf(1);

	// pointing to different memory locations without cache benefits
	// deprecated
	Double f = new Double(1);
	Double ff = new Double(1);

	// comparing
	System.out.println(Integer.compare(a, b));
	System.out.println(a.compareTo(b));
	// decoding from String to Integer
	Integer d = Integer.decode("1");
	// parses a String into a primitive integer
	int e = Integer.parseInt("1");

	System.out.println(d);

    }

}
