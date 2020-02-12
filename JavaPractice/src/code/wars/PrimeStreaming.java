package code.wars;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeStreaming {
    public static void main(String[] args) {
	stream().takeWhile(t -> t < 1000).forEach(t -> System.out.println(t));
    }

    public static IntStream stream() {
	var primeGenerator = new PrimeGenerator();
	return IntStream.iterate(2, t -> primeGenerator.getNext());
    }

}

final class PrimeGenerator {

    private final List<Integer> currentPrimes = new LinkedList<Integer>();

    public PrimeGenerator() {
    }

    /**
     * Returns the next prime number.
     */
    public final int getNext() {
	if (currentPrimes.size() == 0) {
	    currentPrimes.add(3);
	    return 3;
	}
	int candidate = currentPrimes.get(currentPrimes.size() - 1);

	while (true) {
	    if (isPrime(++candidate)) {
		currentPrimes.add(candidate);
		return candidate;
	    }
	}
    }

    private final boolean isPrime(int num) {
	if (num % 2 == 0) {
	    return false;
	}
	for (int i = 3; i * i <= num; i += 2) {
	    if (num % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
