/**
 *
 */
package practice.java.concurrency;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.function.Function;

/**
 * @author apobits@gmail.com
 *
 */
public class ConcurrentHashMapExample {

    private static ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();

    public static void main(String[] args) throws InterruptedException {

	// atomic operations
	cMap.putIfAbsent("Albin", "Perez");
	cMap.computeIfAbsent("Danna", t -> "Perez");
	cMap.computeIfPresent("Danna", (t, u) -> u.concat(" Ortiz"));
	cMap.computeIfPresent("Albin", (t, u) -> null);
	cMap.remove("Albin", null);

	//operations that may not reflect the actual state of the map
	//aggregate status methods may not reflect the actual value if updates are done from multiple threads
	cMap.size();

	//weakly consistent instead of fail fast iterator
	// it won't throw concurrent modification exception
	// it may reflect changes made to the map but is not guaranteed
	Iterator<Entry<String, String>> it = cMap.entrySet().iterator();

	System.out.println(cMap.size());

	var executorService = Executors.newFixedThreadPool(2);
	Runnable runnable1 = () -> cMap.put("runnable1", "runnable1");
	Runnable runnable2 = () -> cMap.put("runnable2", "runnable2");

	executorService.execute(runnable1);
	executorService.execute(runnable2);

	Thread.sleep(1000);

	while (it.hasNext()) {
	    System.out.println(it.next().getKey());
	}

	System.out.println(cMap.size());
	executorService.shutdown();
    }

}
