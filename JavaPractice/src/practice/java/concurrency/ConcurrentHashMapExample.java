/**
 *
 */
package practice.java.concurrency;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * @author apobits@gmail.com
 *
 */
public class ConcurrentHashMapExample {

    private static ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();

    public static void main(String[] args) {

        // atomic operations
        cMap.putIfAbsent("Albin", "Perez");
        cMap.computeIfAbsent("Danna", t -> "Perez");
        cMap.computeIfPresent("Danna", (t, u) -> u.concat(" Ortiz"));
        cMap.computeIfPresent("Albin", (t, u) -> null);

        System.out.println(cMap);
    }

}
