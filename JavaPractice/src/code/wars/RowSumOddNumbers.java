package code.wars;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowSumOddNumbers {
    public static void main(String[] args) {
	assertEquals(74088, rowSumOddNumbers(42));
	assertEquals(74088, rowSumOddNumbersByFormula(42));
    }

    public static int rowSumOddNumbers(int n) {
	int lastOddNumber = -1;
	int sum = 0;
	for (int i = 1; i <= n; i++) {
	    for (int j = 0; j < i; j++) {
		lastOddNumber += 2;
		if (i == n) {
		    sum += lastOddNumber;
		}
	    }
	}
	return sum;
    }

    public static int rowSumOddNumbersByFormula(int n) {
	return n * n * n;
    }

}
