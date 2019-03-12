/**
 * 
 */
package practice.java.varieties;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author apobits@gmail.com
 *
 */
public class RandomExample {

	public static void main(String[] args) {

		// Creating a default Random object
		Random random = new Random();

		// Creating Random object with the specified seed
		// The seed is the initial value of the internal state of the pseudorandom
		// number generator
		// if you want different sequences then you have to specify different seeds
		// values
		Random random1 = new Random(1000);
		Random random2 = new Random(1000);
		Random random3 = new Random(1500);
		for (int i = 0; i < 10; i++) {

			System.out.println("next random int number of random1: " + random1.nextInt());
			System.out.println("next random int number of random2: " + random2.nextInt());
			System.out.println("next random int number of random3: " + random3.nextInt());

			// float and double values are greater than 0.0 and lesser than 1.0
			System.out.println("next random float number of random1: " + random1.nextFloat());
			System.out.println("next random float number of random2: " + random2.nextFloat());
			System.out.println("next random float number of random3: " + random3.nextFloat());
		}

		// streams return by Random are effectively infinite
		DoubleStream doubleStream = random1.doubles();
		IntStream intStream = random2.ints();
		LongStream longStream = random3.longs();

		// gets a random number between 0(inclusive) and the specified
		// parameter(exclusive)
		System.out.println(random.nextInt(5));
	}

}
