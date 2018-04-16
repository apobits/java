/**
 * 
 */
package ortiz.perez.albin.map;

import java.util.IdentityHashMap;

/**
 * @author Administrador
 *
 */
public class IdentityHashMapExample {
	// It is the same as HashMap but it uses reference equality when
	// comparing(keys)
	// elements
	public static void main(String[] args) {
		IdentityHashMap<Person, Integer> iHashMap = new IdentityHashMap<>();
		Person p = new Person("Albin");
		Person pp = new Person("Albin");
		iHashMap.put(p, 1);
		iHashMap.put(pp, 2);
		iHashMap.put(p, 3);// it does not store as this object referenced is
							// already in the map
		System.out.println(iHashMap);

		IdentityHashMap<String, Integer> iHashMapS = new IdentityHashMap<>();
		String s = new String("Albin");
		String t = new String("Albin");
		System.out.println("t equals " + s.equals(t));

		iHashMapS.put(s, 1);
		iHashMapS.put(t, 2);// it allows duplicate keys because the object
							// references are different

		System.out.println(iHashMapS);

	}

	static class Person {
		public Person(String name) {
			this.name = name;
		}

		String name;
	}
}
