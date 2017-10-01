/**
 * 
 */
package ortiz.perez.albin.collection.hashset;

import java.util.HashSet;

/**
 * @author Administrador
 *
 */
public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("abcde");
		hashSet.add("babcd");
		hashSet.add("cabde");
		hashSet.add("d");
		hashSet.add("e");
		hashSet.add("f");

		System.out.println(hashSet);

	}

}
