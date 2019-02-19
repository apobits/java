/**
 * 
 */
package practice.java.collection;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import practice.java.collection.SetExample.Vowel;

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

	public static void treeMap() {
		// TreeMap extends AbstractMap and implements NavigableMap
		// Elements are sorted in ascending key order

		// Empty constructor
		TreeMap<Integer, String> persons = new TreeMap<>();

		// Constructor with comparator parameter
		TreeMap<Integer, String> treeMap1 = new TreeMap<>((t, u) -> t - u);

		// Constructor with SortedMap parameter
		Map<Integer, String> treeMap2 = new TreeMap<>(treeMap1);

		// Constructor with Map parameter
		TreeMap<Integer, String> treeMap3 = new TreeMap<>(treeMap2);

		persons.put(1, "Albin");
		persons.put(3, "Marcela");
		persons.put(2, "Danna");
		persons.forEach((t, u) -> System.out.println("Name: " + u + "\rID: " + t + "\n"));

	}

	public static void linkedHashMap() {
		// LinkedHashMap created with defaults
		// insertion order map
		// default capacity 16
		// default load factor 0.75
		LinkedHashMap<Integer, String> insertionOrderMap = new LinkedHashMap<>();

		// LinkedHashMap created with defaults
		// access order map
		// default capacity 16
		// default load factor 0.75
		LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);

		// LinkedHashMap constructed with initial capacity of 20
		// load factor 0.75
		LinkedHashMap<Integer, String> hashMap1 = new LinkedHashMap<>(20);

		// LinkedHashMap created with the mappings in the map argument
		// load factor 0.75
		// enough capacity to hold the mappings from the map parameter
		LinkedHashMap<Integer, String> hashMap2 = new LinkedHashMap<>(insertionOrderMap);

		// LinkedHashMap created with the specified capacity and load factor
		LinkedHashMap<Integer, String> hashMap3 = new LinkedHashMap<>(30, 0.80f);

		// LinkedHashMap created with the specified capacity, load factor and access
		// order
		LinkedHashMap<Integer, String> hashMap4 = new LinkedHashMap<>(30, .80f, true);

		insertionOrderMap.put(2, "Danna");
		insertionOrderMap.put(3, "Marcela");
		insertionOrderMap.put(1, "Albin");

		insertionOrderMap.forEach((t, u) -> System.out.println("Name: " + u + "\nId: " + t + "\n"));

		accessOrderMap.putAll(insertionOrderMap);

		accessOrderMap.get(1);

		accessOrderMap.forEach((t, u) -> System.out.println("Name: " + u + "\nId: " + t + "\n"));

	}

	public static void identityHashMap() {
		// default expected maximum size 21
		// uses references for equality
		// this map is not for general use according to the specification
		// extends AbstractMap and implements Map
		IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();

		identityHashMap.put(1, "Albin");
		identityHashMap.put(3, "Marcela");
		identityHashMap.put(2, "Danna");
		identityHashMap.put(4, "Albin");
		identityHashMap.put(5, "Marcela");
		identityHashMap.put(6, "Danna");
		identityHashMap.put(7, "Albin");
		identityHashMap.put(8, "Marcela");
		identityHashMap.put(9, "Danna");
		identityHashMap.put(10, "Albin");
		identityHashMap.put(11, "Marcela");
		identityHashMap.put(12, "Danna");
		identityHashMap.put(13, "Albin");
		identityHashMap.put(14, "Marcela");
		identityHashMap.put(15, "Danna");
		identityHashMap.put(16, "Albin");
		identityHashMap.put(17, "Marcela");
		identityHashMap.put(18, "Danna");
		identityHashMap.put(19, "Albin");
		identityHashMap.put(20, "Marcela");
		identityHashMap.put(21, "Danna");
		identityHashMap.put(22, "Albin");
		identityHashMap.put(23, "Marcela");
		identityHashMap.put(24, "Danna");

		identityHashMap.forEach((t, u) -> System.out.println("Name: " + u + "\nId: " + t + "\n"));

	}

	public static void enumMap() {
		// extends AbstractMap and implements Map
		// map that supports keys of type enumeration

		// Empty EnumMap that supports keys of the specified enumeration type
		EnumMap<Vowel, String> enumMap = new EnumMap<>(Vowel.class);

		// EnumMap with the same key type as the specified EnumMap argument, and with
		// the mapping of the specified argument if any
		Map<Vowel, String> enumMap1 = new EnumMap<>(enumMap);
		enumMap1.put(Vowel.E, "E vowel");

		// EnumMap with the same key type as one of the elements in the map and the same
		// mappings
		// if the specified map contains no elements then an IllegalArgumentException is
		// thrown
		EnumMap<Vowel, String> enumMap2 = new EnumMap<>(enumMap1);

		enumMap.put(Vowel.A, "A value");
		System.out.println(enumMap);

		System.out.println(enumMap2);
	}

	public static void main(String[] args) {
		enumMap();
		System.exit(1);
		identityHashMap();
		linkedHashMap();
		treeMap();
		hashMap();
	}

}
