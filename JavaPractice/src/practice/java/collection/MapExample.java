/**
 * 
 */
package practice.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author apobits@gmail.com
 *
 */
public class MapExample {

	public void hashMap() {
		Map<Integer, Integer> map = new HashMap<>();

		Map<Integer, Integer> map2 = new HashMap<>();

		// Associates the specified value to the specified key in this map
		// if the key has a mapping already the old value is replaced
		map.put(1, 1);

		// returns true if the map contains the specified key
		map.containsKey(1);

		// returns the value associated to the specified key or null if the key does not
		// exists
		map.get(1);

		// removes the specified mapping for this key if it exits,
		map.remove(1);

		// returns true if the map contains key that maps to the specified value
		map.containsValue(1);

		// returns true if this map contains no key value mappings
		map.isEmpty();

		// copies all the elements of the map argument to the map who is calling the
		// method
		map2.putAll(map);

		// iterating the keys of the map
		Set<Integer> keys = map.keySet();
		for (Integer x : keys) {
			System.out.println(x);
		}

		// iterating the values of the map
		Collection<Integer> values = map.values();
		for (Integer x : values) {
			System.out.println(x);
		}

		// iterating on an entryset
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> x : entries) {
			System.out.println(x.getKey() + " = " + x.getValue());
		}

	}

	public static void main(String[] args) {

	}

}
