public class QuickPractice {

    public int[] solution(int n, int[] a) {
	int max = 0, base = 0, maxCounters = 0;
	int counters[] = new int[n];
	java.util.HashMap<Integer, Boolean> marked = new java.util.HashMap<>(n);
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == n + 1) {
		maxCounters++;
		counters = new int[n];
		base = max;
		marked = new java.util.HashMap<>(n);
	    } else if (a[i] >= 1 && a[i] <= n) {
		if (base != 0 && (marked.get(a[i] - 1) == null || !marked.get(a[i] - 1))) {
		    counters[a[i] - 1] = 1 + base;
		    marked.put(a[i] - 1, true);
		} else {
		    counters[a[i] - 1]++;
		}
		max = max < counters[a[i] - 1] ? counters[a[i] - 1] : max;
	    }
	}
	if (maxCounters < a.length) {
	    setBase(counters, base);
	}
	return counters;
    }

    private void setBase(int[] counters, int base) {
	setBase(counters, base, 0, counters.length);
    }

    private void setBase(int[] counters, int base, int start, int end) {
	for (int i = start; i < end; i++) {
	    if (counters[i] == 0) {
		counters[i] = base;
	    }
	}
    }

    public static void main(String[] args) {

	int[] a = new int[] { 6, 6, 6, 6, 6, 6, 6 };
	QuickPractice q = new QuickPractice();
	q.solution(5, a);

    }

}
