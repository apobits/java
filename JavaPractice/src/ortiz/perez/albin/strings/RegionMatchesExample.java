/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author aposo
 *
 */
public class RegionMatchesExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String a = "Hello world";
	String b = "Hello World";

	System.out.println(a.regionMatches(false, 6, b, 6, 5));// Comparing world word case sensitive
	System.out.println(a.regionMatches(true, 6, b, 6, 5));// Comparing world word case insensitive

    }

}
