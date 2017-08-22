/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author aposo
 *
 */
public class StringIndexExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String a = "Hello World";

	System.out.println(a.indexOf(' '));//get the position of the first occurrence
	System.out.println(a.indexOf('o'));
	System.out.println(a.lastIndexOf('W'));//get the position of the last index

	System.out.println(a.indexOf('o', 5));// get the position of the index from a starting point

    }

}
