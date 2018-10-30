package ortiz.perez.albin.object;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Solution {

	/****************************************************************
	 * Complete the method below. You must return an array of numbers that are prime
	 * numbers, fibonacci numbers and less or equal to n.
	 ****************************************************************/
	static int[] printPrimeFibonacciNumbers(int n) {
		TreeSet<Integer> fib = new TreeSet<>();
		TreeSet<Integer> result = new TreeSet<>();
		int temp = 0;
		while ((temp = FibonacciGenerator.getNext()) <= n) {
			fib.add(temp);
		}
		temp = 0;
		while ((temp = PrimeGenerator.getNext()) <= n) {
			if (fib.contains(temp)) {
				result.add(temp);
			}
		}
		int[] primeFib = new int[result.size()];
		int counter = 0;
		while (!result.isEmpty()) {
			primeFib[counter++] = result.pollFirst();
		}
		return primeFib;
	}

	public static void main(String[] args) throws IOException {
		int primeFib []= printPrimeFibonacciNumbers(20);
		for(int n:primeFib) {
			System.out.print(n+" ");
		}
	}
}

final class FibonacciGenerator {

	private static int currentStep = 0;

	private FibonacciGenerator() {
	}

	private static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	/**
	 * Resets the Fibonacci series.
	 */
	public static void resetSeries() {
		currentStep = 0;
	}

	/**
	 * Returns the last number in the current Fibonacci series.
	 */
	public static int getNext() {
		return fib(++currentStep);
	}

}

final class PrimeGenerator {

	private static List<Integer> currentPrimes = new LinkedList<Integer>();

	private PrimeGenerator() {
	}

	/**
	 * Returns the next prime number.
	 */
	public static int getNext() {
		if (currentPrimes.size() == 0) {
			currentPrimes.add(2);
			return 2;
		}
		int candidate = currentPrimes.get(currentPrimes.size() - 1);

		while (true) {
			if (isPrime(++candidate)) {
				currentPrimes.add(candidate);
				return candidate;
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i < num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
