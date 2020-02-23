/**
 *
 */
package practice.java.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author apobits@gmail.com
 *
 *
 */

public class DailyPracticeExample {
    public static void main(String[] args) {
	Runnable runnable = Common::printSomething;
	new Thread(runnable).start();

//	ExecutorService executorService = Executors.newFixedThreadPool(20);
//
//	IntStream.iterate(0, t -> t < 20, t -> {
//	    executorService.execute(runnable);
//	    return ++t;
//	}).forEach(t -> {});
//
//	executorService.shutdown();
    }
}