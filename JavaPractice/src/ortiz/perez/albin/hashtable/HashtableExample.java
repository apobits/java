/**
 * 
 */
package ortiz.perez.albin.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Administrador
 *
 */
public class HashtableExample {

    public static void main(String[] args) {

	// hashtable stores the value at the index specified by the hashed
	// key(it hashes the key)
	// value
	Hashtable<Integer, String> letters = new Hashtable<>();
	letters.put(1, "A");
	letters.put(3, "C");
	letters.put(2, "B");
	letters.put(1, "D");
	Enumeration<Integer> e = letters.keys();// Enumeration serves methods to
						// iterate over the hashtable
						// keys

	while (e.hasMoreElements()) {
	    Integer key = e.nextElement();
	    System.out.println(key + " = " + letters.get(key));
	}
	System.out.println(letters);

    }

}
