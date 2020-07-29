package code.wars;

import java.util.stream.IntStream;

public class BeginnerSeriesN3SumOfNumbers {
    public static void main(String[] args) {
	long start = System.nanoTime();
	getSum(-1000, 1000);
	System.out.println(System.nanoTime() - start);
	start = System.nanoTime();
	getSumV2(-1000, 1000);
	System.out.println(System.nanoTime() - start);
    }

    public static int getSum(int a, int b) {
	if (a == b) {
	    return a;
	}

	int min, max, sum = 0;

	if (a > b) {
	    min = b;
	    max = a;
	} else {
	    min = a;
	    max = b;
	}

	for (int i = min; i <= max; i++) {
	    sum += i;
	}

	return sum;
    }

    public static int getSumV2(int a, int b) {
	if (a == b) {
	    return a;
	}

	int min, max, sum = 0;

	if (a > b) {
	    min = b;
	    max = a;
	} else {
	    min = a;
	    max = b;
	}

	return IntStream.range(min, max).sum();
    }
}
