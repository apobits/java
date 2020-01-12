package code.wars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class TheObservedPIN {
    public static void main(String[] args) {
	System.out.println(getPINs("11"));
    }

    public static List<String> getPINs(String observed) {
	var list = new ArrayList<String>();
	for (int i = 0; i < observed.length(); i++) {
	    var value = Integer.valueOf(observed.substring(i, i + 1));
	    var adjacent = getAdjacent(value);
	    if (list.isEmpty()) {
		for (Integer number : adjacent) {
		    list.add(String.valueOf(number));
		}
	    } else {
		var tempSet = new ArrayList<String>();
		for (Integer number : adjacent) {
		    for (String s : list) {
			tempSet.add(s + number);
		    }
		}
		list = tempSet;
	    }
	}

	return list;
    }

    private static int[] getAdjacent(int number) {
	switch (number) {
	case 1:
	    return new int[] { 1, 2, 4 };
	case 2:
	    return new int[] { 2, 1, 3, 5 };
	case 3:
	    return new int[] { 3, 2, 6 };
	case 4:
	    return new int[] { 4, 1, 5, 7 };
	case 5:
	    return new int[] { 5, 2, 4, 6, 8 };
	case 6:
	    return new int[] { 6, 3, 5, 9 };
	case 7:
	    return new int[] { 7, 4, 8 };
	case 8:
	    return new int[] { 8, 5, 7, 9, 0 };
	case 9:
	    return new int[] { 9, 6, 8 };
	case 0:
	    return new int[] { 0, 8 };
	}
	return new int[] {};
    }

}
