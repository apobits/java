/**
 * 
 */
package practice.java.concurrency;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author apobits@gmail.com
 *
 */
public class ConcurrentHashMapExample {

	private static ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();

	public static void main(String[] args) {

		cMap.putIfAbsent("Albin", "Perez");

		Iterator<Entry<String, String>> it1 = cMap.entrySet().iterator();

		System.out.println(it1);

		Iterator<Entry<String, String>> it2 = cMap.entrySet().iterator();

		System.out.println(it2);

	}

}
