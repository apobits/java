/**
 * 
 */
package ortiz.perez.albin.floats;

/**
 * @author aposo
 *
 */
public class FloatExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Float f = new Float(10.0);
	Float g = new Float(11.0);
	Float h = new Float(10.0);
	Float i = new Float(1/0.);
	System.out.println("Number of bytes used to represent a float value " + Float.BYTES);
	System.out.println("10.0 comparedTo 11.0 is " + f.compareTo(11.0f));
	System.out.println("11.0 comparedTo 10.0 is " + g.compareTo(10.0f));
	System.out.println("10.0 comparedTo 10.0 is " + f.compareTo(10.0f));
	System.out.println("f compared to g is  " + Float.compare(f, g));
	System.out.println("f equals h is " + f.equals(h));
	System.out.println("comparedTo returns 0 if both numbers are numerically equals");
	System.out.println("comparedTo returns negative if the invoking object is lesser than the on passed as a parameter");
	System.out.println("comparedTo returns positive if the invoking object is greater than the on passed as a parameter");
	System.out.println(Float.hashCode(f));
	System.out.println(Float.hashCode(h));
	System.out.println(Float.hashCode(g));
	System.out.println(Float.intBitsToFloat(0x7f800000));

    }

}
