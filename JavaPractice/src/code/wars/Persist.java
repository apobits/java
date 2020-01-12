package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Persist {
    public static void main(String[] args) {
	assertEquals(3, persistence(39));
	assertEquals(4, persistence(999));
	assertEquals(0, persistence(4));
    }

    public static int persistence(long n) {
	int counter = 0;
	var number = String.valueOf(n);

	while (number.length() > 1) {
	    int computedNumber = 1;
	    for (int i = 0; i < number.length(); i++) {
		computedNumber *= Integer.valueOf(number.substring(i, i + 1));
	    }
	    number = String.valueOf(computedNumber);
	    counter++;
	}

	return counter;
    }
}
