package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ARuleOfDivisibilityBySeven {
    public static void main(String[] args) {
	var result = seven(1603);
	assertEquals(7, result[0]);
	assertEquals(2, result[1]);
    }

    public static long[] seven(long m) {
	var array = new long[2];
	array[0] = m;
	while (array[0] > 99) {
	    array[0] = (array[0] / 10) - ((array[0] % 10) * 2);
	    array[1]++;
	}
	return array;
    }

}
