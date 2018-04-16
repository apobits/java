/**
 * 
 */
package ortiz.perez.albin.finalx;

import java.util.HashMap;

/**
 * @author apobits@gmail.com
 *
 */
public class ArrayListHolder {

    private HashMap<Integer, String> people;

    public ArrayListHolder() {
	people = new HashMap<>();
    }

    public void add(Integer id, String name) {
	people.put(id, name);
    }

    public String get(Integer id) {
	return people.get(id);
    }

}
