package code.wars;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PickPeaks {

    public static void main(String[] args) {
	System.out.println(getPeaks(new int[] {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
	var result = new HashMap<String, List<Integer>>();
	result.put("pos", new ArrayList<>());
	result.put("peaks", new ArrayList<>());
	var pos = -1;
	for (int i = 1; i < arr.length - 1; i++) {

	    if (arr[i] > arr[i - 1]) {
		pos = i;
	    }

	    if (pos != -1 && arr[i] > arr[i + 1]) {
		result.get("pos").add(pos);
		result.get("peaks").add(arr[pos]);
		pos = -1;
	    }
	}

	return result;
    }
}
