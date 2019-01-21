/**
 * 
 */
package practice.java.varieties;

import java.time.LocalTime;

/**
 * @author apobits@gmail.com
 *
 */
public class RuntimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		// prints the total memory of the jvm
		System.out.println("Total memory is " + runtime.totalMemory() + " " + LocalTime.now());
		
		// prints the free memory available in the jvm
		System.out.println("Free memory is " + runtime.freeMemory() + " " + LocalTime.now());

		int[] array = new int[100000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		// call the garbage collector
		// runtime.gc();

		// prints the total memory of the jvm
		System.out.println("Total memory is " + runtime.totalMemory() + " " + LocalTime.now());
		
		// prints the free memory available in the jvm
		System.out.println("Free memory is " + runtime.freeMemory() + " " + LocalTime.now());

	}

}
