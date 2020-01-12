package code.wars;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextSmallerNumberWithSameDigits {
    public static void main(String[] args) {
//	assertEquals(-1, nextSmaller(9));
//	assertEquals(-1, nextSmaller(111));
//	assertEquals(-1, nextSmaller(135));
//	assertEquals(-1, nextSmaller(1027));
//	assertEquals(12, nextSmaller(21));
//	assertEquals(513, nextSmaller(531));
	assertEquals(2017, nextSmaller(2071));
    }

    public static long nextSmaller(long n) {
	if (String.valueOf(n).length() == 1) {
	    return -1;
	}

	var number = String.valueOf(n);
	var original = number;
	var set = new TreeSet<String>();

	do {
	    var temp = number;
	    temp = number.substring(0, 1) + number.substring(number.length() - 1) + number
			    .substring(1, number.length() - 1);
	    set.add(temp);
	    temp = number.substring(number.length() - 1) + number.substring(0, 1) + number
			    .substring(1, number.length() - 1);
	    set.add(temp);
	    number = temp;
	} while (!original.equals(number));

	for (; ; ) {
	    if (set.pollLast().equals(original)) {
		break;
	    }
	}

	if (set.isEmpty() || set.last().startsWith("0")) {
	    return -1;
	}

	return Long.valueOf(set.pollLast());
    }
}
