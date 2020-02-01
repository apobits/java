package code.wars;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMixedArray {

    public static void main(String[] args) {
	assertEquals(10, sum(Arrays.asList(1, "2", 3, "4")));
    }

    public static int sum(List<?> mixed) {
	return mixed.stream().mapToInt(t -> {
	    return t instanceof String ? Integer.valueOf((String) t) : Integer.valueOf((Integer) t);
	}).sum();
    }
}
