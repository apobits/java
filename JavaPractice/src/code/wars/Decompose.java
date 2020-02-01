package code.wars;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Decompose {
    private static Map<Long, Long> mapNumVal(long number) {
	var map = new TreeMap<Long, Long>(Comparator.reverseOrder());
	for (long i = 1; i < number; i++) {
	    map.put(i * i, i);
	}
	return map;
    }

    public static String decompose(long n) {
	var map = mapNumVal(n);

	for (Long number : map.keySet()) {
	    var sb = new StringBuilder();
	    sb.append(map.get(number)).append(" ");
	    var left = findLeft(map, (n * n) - number);
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
