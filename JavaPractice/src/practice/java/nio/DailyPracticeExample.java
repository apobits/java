/**
 * 
 */
package practice.java.nio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apobits@gmail.com
 * 
 *
 */

public class DailyPracticeExample {
	
	public static List<Long> primeFactors(long x) {
		  ArrayList<Long> result = new ArrayList<>();
		  long factor = 2;
		  while (x > 1) {
		    if (x % factor == 0) {
		      result.add(factor);
		      x /= factor;
		    } else {
		      factor += 1;
		    }
		  }
		  return result;
		}  

	public static void main(String args[]) throws InterruptedException {
		primeFactors(9);

	}
}
