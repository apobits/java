package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Q5 extends RecursiveTask<Integer> {

	int low, high;

	final int THRESHOLD = 5;

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

	public Q5(int low, int high) {
		this.low = low;
		this.high = high;
	}

	public Integer computeDirectly() {
		int sum = 0;
		for (; low < high; low++) {
			sum += numbers.get(low);
		}
		return sum;
	}

	@Override
	protected Integer compute() {
		int result = 0, mid = 0;
		if (high - low <= 5) {
			return computeDirectly();
		} else {
			mid = (high + low) / 2;
			Q5 q1 = new Q5(low, mid);
			Q5 q2 = new Q5(mid, high);
			q1.fork();
			q2.fork();
			result = q2.join() + q1.join();
		}
		return result;
	}

	public static void main(String[] args) {
		Q5 q5 = new Q5(0, 10);
		System.out.println(q5.compute());
	}

}
