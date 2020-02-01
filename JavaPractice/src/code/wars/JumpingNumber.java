package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingNumber {

    public static void main(String[] args) {
	assertEquals("Jumping!!",jumpingNumber(1235));
    }

    public static String jumpingNumber(int number) {
	return String.valueOf(number).chars().reduce((t, u) -> (t != -1 && (t + 1 == u || t - 1 == u) ? u : -1))
			.orElse(-1) > -1 ? "Jumping!!" : "Not!!";
    }

}
