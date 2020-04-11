package code.wars;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Decompose {
    private static Map<Long, Long> mapNumVal(long number) {
	TreeMap<Long, Long> map = new TreeMap<Long, Long>(Comparator.reverseOrder());
	for (long i = 1; i < number; i++) {
	    map.put(i * i, i);
	}
	return map;
    }

    public static String decompose(long n) {
	Map<Long, Long> map = mapNumVal(n);

	for (Long number : map.keySet()) {
	    StringBuilder sb = new StringBuilder();
	    sb.append(map.get(number)).append(" ");
	    String left = findLeft(map, (n * n) - number);
	    if (left != null) {
		return sb.append(left).toString();
	    }
	}
	return null;
    }

    private static String findLeft(Map<Long, Long> map, long rightLimit) {
	return null;
    }
}
