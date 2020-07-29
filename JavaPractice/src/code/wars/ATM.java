package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATM {
    public static void main(String[] args) {
	assertEquals(1, solve(200));
	assertEquals(4, solve(770));
	assertEquals(-1, solve(125));
	assertEquals(2, solve(550));
	assertEquals(1, solve(10));
	assertEquals(-1, solve(238));
    }

    public static int solve(int n) {
	int temp = n, count = 0;

	while (temp - 500 >= 0) {
	    count++;
	    temp -= 500;
	}

	while (temp - 200 >= 0) {
	    count++;
	    temp -= 200;
	}

	while (temp - 100 >= 0) {
	    count++;
	    temp -= 100;
	}

	while (temp - 50 >= 0) {
	    count++;
	    temp -= 50;
	}

	while (temp - 20 >= 0) {
	    count++;
	    temp -= 20;
	}

	while (temp - 10 >= 0) {
	    count++;
	    temp -= 10;
	}

	if (temp > 0) {
	    return -1;
	} else {
	    return count;
	}

    }

}
