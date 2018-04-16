/**
 * 
 */
package ortiz.perez.albin.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrador
 *
 */
public class HashMapExample {

    public static void main(String[] args) {
	// HashMaps do not preserve the order of addition to the map
	Map<Integer, Integer> numbers = new HashMap<>();
	numbers.put(1, 1);
	numbers.put(2, 2);
	numbers.put(3, 3);
	numbers.put(4, 4);
	for (Map.Entry<Integer, Integer> x : numbers.entrySet()) {
	    System.out.print(x + " ");
	}

	Map<String, String> names = new HashMap<>();
	names.put("Albin", "Perez");
	names.put("Albin", "Ortiz");

	for (Map.Entry<String, String> x : names.entrySet()) {
	    System.out.print(x + " ");
	}
	for (String x : names.keySet()) {
	    System.out.print(x + " ");
	}
	for (String x : names.values()) {
	    System.out.print(x + " ");
	}
    }

}
