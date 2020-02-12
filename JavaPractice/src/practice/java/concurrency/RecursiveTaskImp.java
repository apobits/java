package practice.java.concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskImp extends RecursiveTask<Double> {
    private final double[] numbers;
    private final int start, end, threshold = 10000;

    public RecursiveTaskImp(int start, int end, double[] numbers) {
	this.start = start;
	this.end = end;
	this.numbers = numbers;
    }

    public static void main(String[] args) {
        var size = 100000;
	var numbers = new double[size];
	for (int i = 0; i < size; i++) {
	    numbers[i] = Math.random();
	}
	var start = System.currentTimeMillis();
	System.out.print(sum(numbers));
	System.out.printf(" Executed in %d milliseconds\n", (System.currentTimeMillis() - start));

	var recursiveTask = new RecursiveTaskImp(0, size, numbers);
	var forkJoinPool = new ForkJoinPool();
	start = System.currentTimeMillis();
	forkJoinPool.invoke(recursiveTask);
	System.out.print(recursiveTask.join());
	System.out.printf(" Executed in %d milliseconds", (System.currentTimeMillis() - start));

    }

    public static double sum(double[] numbers) {
	return Arrays.stream(numbers).sum();
    }

    @Override
    protected Double compute() {
	double sum = 0;
	if ((end - start) < threshold) {
	    for (int i = start; i < end; i++) {
		sum += numbers[i];
	    }
	    return sum;
	}

	var mid = (start + end) / 2;
	var recursiveTask1 = new RecursiveTaskImp(start, mid, numbers);
	var recursiveTask2 = new RecursiveTaskImp(mid, end, numbers);

	invokeAll(recursiveTask1, recursiveTask2);

	return recursiveTask1.join() + recursiveTask2.join();
    }
}
