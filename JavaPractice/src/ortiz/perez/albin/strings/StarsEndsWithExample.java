/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author aposo
 *
 */
public class StarsEndsWithExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String a = "Hellow World";
	
	System.out.println(a.startsWith("He"));
	
	System.out.println(a.endsWith("d"));
	
	System.out.println(a.startsWith("World",7));

    }

}
