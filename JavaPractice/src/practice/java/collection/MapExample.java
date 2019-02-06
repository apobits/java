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

	public static void hashMap() {
		// creates an empty hash map with default initial capacity 16 and default load
		// factor 0.75
		Map<Integer, Integer> map = new HashMap<>();

		// creates a hash map initialized with the same mapping in the specified map,
		// with default load factor 0.75 and sufficient capacity to hold the mappings in
		// the specified map
		Map<Integer, Integer> map2 = new HashMap<>(map);

		// creates an empty hash map with the specified initial capacity
		Map<Integer, Integer> map3 = new HashMap<>(30);

		// creates an empty hash map with the specified initial capacity and load factor
		Map<Integer, Integer> map4 = new HashMap<>(20, 0.75f);

		// Associates the specified value to the specified key in this map
		// if the key has a mapping already the old value is replaced
		// returns the previous value associated with the key or null if there was no
		// mapping
		map.put(1, 1);

		// returns true if the map contains the specified key
		map.containsKey(1);

		// returns the value associated to the specified key or null if the key does not
		// exists
		map.get(1);

		// removes the specified mapping for this key if it exits, and returns its value
		// or null if there was no mapping
		map.remove(1);

		// returns true if the map contains key that maps to the specified value
		map.containsValue(1);

		// returns true if this map contains no key value mappings
		map.isEmpty();

		// copies all the elements of the map argument to the map who is calling the
		// method
		// it behaves like map.put(K,V)
		map2.putAll(map);

		// adds the specified mapping only if no previous mapping exists or the key is
		// mapping to null
		// returns null if the mapping was made or the previous value(it can be null if
		// the key was mapped to null)
		map.putIfAbsent(1, 2);

		// attempts to compute a mapping for the specified key and its current value or
		// null if there is no current mapping
		map.compute(1, (t, u) -> {
			return ++u;
		});

		// throws null pointer exception as there was no current mapping or value was
		// null
//		map.compute(2, (t, u) -> {
//			return ++u;
//		});

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

		// using foreEach method
		System.out.println("Printing maps elements with foreEach method: ");
		map.forEach((t, u) -> System.out.print(t + "=" + u + " "));

		// if the specified mapping does not exists or the value mapped is null, it
		// associates or replaces null with the specified value
		// if the mapping exists it replaces the old value with the one return by the
		// bifunction
		map.merge(3, 3, (t, u) -> u);

		// if the specified key is not mapped or its mapping is null then adds the
		// mapping with the result return by the function
		map.computeIfAbsent(4, t -> t * 3);

		// if the key has a mapping and its mapping value is different from null
		// attempts to compute a new mapping given its key and its current mapped value
		map.computeIfPresent(4, (t, u) -> u * 3);

		// replaces the entry for the specified key
		// returns the previous value associated with the key
		map.replace(4, 40);

		// replaces the entry for the specified key only if its mapped to the specified
		// value
		map.replace(4, 40, 50);

		// replaces all the values mapped with the value returned by the bifunction
		map.replaceAll((t, u) -> u + 2);

		// returns the value to which the specified key is mapped or returns the default
		// value if the key has no mappings in this map
		map.getOrDefault(4, 60);

		// removes all the mappings in the map
		map.clear();

	}

	public static void main(String[] args) {
		hashMap();
	}

}
