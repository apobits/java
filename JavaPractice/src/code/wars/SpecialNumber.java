package code.wars;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialNumber {
    public static void main(String[] args) {
	assertEquals("Special!!", specialNumber(234));
    }

    //A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5
    public static String specialNumber(int number) {
	return String.valueOf(number).matches("^[012345]+$") ? "Special!!" : "NOT!!";
    }
}
