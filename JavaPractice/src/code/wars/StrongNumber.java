package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongNumber {

    public static void main(String[] args) {
	assertEquals("STRONG!!!!", isStrongNumber(505390));
    }

    //Strong number is the number that the sum of the factorial of its digits is equal to number itself.
    public static String isStrongNumber(int num) {
	int sum = 0;
	int copy = num;
	while (copy > 0) {
	    int digit = copy % 10;
	    if (digit > 0) {
		sum += factorial(digit);
	    }
	    copy = copy / 10;
	}
	return sum == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int factorial(int number) {
	if (number == 1) {
	    return number;
	}
	return number * factorial(number - 1);
    }

}
