/**
 * 
 */
package ortiz.perez.albin.hashtable;

import java.util.Hashtable;

/**
 * @author apobits@gmail.com
 *
 */
public class HashtableStringKeyExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Hashtable<String, String> names = new Hashtable<>();

	names.put("Albin", "Perez");

	System.out.println(names.get("Albin"));

    }

}
