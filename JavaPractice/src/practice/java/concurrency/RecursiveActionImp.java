/**
 *
 */
package practice.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author apobits@gmail.com
 *
 */
public class RecursiveActionImp extends RecursiveAction {

    private static final long serialVersionUID = 1L;
    private final int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int start, end, threshold = 3;

    public RecursiveActionImp(int start, int end) {
	this.start = start;
	this.end = end;
    }

    public static void main(String[] args) {
	var fjp = new ForkJoinPool();
	var obj = new RecursiveActionImp(0, 10);
	fjp.invoke(obj);
	obj.join();
    }

    private void computeLogic() {
	for (int i = start; i < end; i++) {
	    System.out.println(Thread.currentThread().getName() + ": " + numbers[i]);
	}
    }

    @Override
    protected void compute() {
	if ((end - start) < threshold) {
	    computeLogic();
	    return;
	}
	var mid = (start + end) / 2;
	RecursiveActionImp r1 = new RecursiveActionImp(start, mid);
	RecursiveActionImp r2 = new RecursiveActionImp(mid, end);
	invokeAll(r1, r2);
    }

}
