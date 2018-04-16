/**
 * 
 */
package ortiz.perez.albin.map;

import java.util.LinkedHashMap;

/**
 * @author Administrador
 *
 */
public class LinkedHashMapExample {
    // Mantains a linked list of entries in the map
    public static void main(String[] args) {

	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(16, 0.75f, false);
	map.put(2, 2);
	map.put(1, 1);
	map.put(3, 3);
	map.put(3, 5);
	map.get(1);
	System.out.println(map);
    }

}
