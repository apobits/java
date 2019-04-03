/**
 * 
 */
package practice.java.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author apobits@gmail.com
 *
 */
public class RecursiveActionImp extends RecursiveAction {

	private int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	private static final long serialVersionUID = 1L;

	int start, lenght, threshold;

	public RecursiveActionImp(int start, int lenght) {
		this.start = start;
		this.lenght = lenght;
	}

	private void computeLogic() {

		for (int i = start; i < start + lenght; i++) {
			System.out.print(numbers[i]);
		}

	}

	@Override
	protected void compute() {
		if (lenght <= 10) {
			computeLogic();
			return;
		}
		invokeAll(new RecursiveActionImp(start, lenght / 2), new RecursiveActionImp(start + lenght / 2, lenght / 2));
	}

	public static void main(String[] args) {
		ForkJoinPool fjp = new ForkJoinPool();
		RecursiveActionImp obj = new RecursiveActionImp(0, 20);
		fjp.invoke(obj);
	}

}
