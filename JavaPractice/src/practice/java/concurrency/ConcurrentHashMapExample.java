/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author apobits@gmail.com
 *
 */
public class ConcurrentHashMapExample {

	private static ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();

	public static void main(String[] args) {

		cMap.putIfAbsent("Albin", "Perez");

	}

}
