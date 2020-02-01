package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TidyNumber {
    public static void main(String[] args) {
	assertEquals(true, tidyNumber(123456));
    }

    public static boolean tidyNumber(int number) {
	return String.valueOf(number).chars().reduce((left, right) -> (left != -1 && left <= right) ? right : -1)
			.orElse(-1) > -1;
    }
}
