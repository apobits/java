package code.wars;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ExtractPerfectNumbers {
    public static void main(String[] args) {
	System.out.println(Integer.toBinaryString(7).matches("^1[10]*1$||^1$"));
	System.out.println(Arrays.toString(extraPerfect(3)));
	System.out.println(Arrays.toString(extraPerfect(5)));
	System.out.println(Arrays.toString(extraPerfect(8)));
    }

    public static int[] extraPerfect(int number) {
	var perfectNumbers = new TreeSet<Integer>();

	for (int i = 1; i <= number; i++) {
	    if (Integer.toBinaryString(i).matches("^1[10]*1$||^1$")) {
		perfectNumbers.add(i);
	    }
	}

	return perfectNumbers.stream().mapToInt(t -> t).toArray(); // Do your magic!
    }

    public static int[] extraPerfectV2(int number) {
	return IntStream.rangeClosed(1, number).filter(t -> Integer.toBinaryString(t).matches("^1[10]*1$||^1$"))
			.toArray();
    }
}
