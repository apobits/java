package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomorphicNumber {
    public static void main(String[] args) {
	//	assertEquals("Automorphic", autoMorphicV2(1));
	//	assertEquals("Not!!", autoMorphicV2(3));
	//	assertEquals("Automorphic", autoMorphicV2(6));
	//	assertEquals("Not!!", autoMorphicV2(9));
	assertEquals("Automorphic", autoMorphicV2(25));
	assertEquals("Not!!", autoMorphicV2(13));
	assertEquals("Automorphic", autoMorphicV2(76));
	assertEquals("Not!!", autoMorphicV2(95));
    }

    public static String autoMorphic(int number) {
	String square = String.valueOf((int) Math.pow(number, 2));
	String numberS = String.valueOf(number);
	return square.substring(square.length() - numberS.length()).equals(numberS) ? "Automorphic" : "Not!!";
    }

    public static String autoMorphicV2(int number) {
	int square = number * number;
	double digits = Math.pow(10, String.valueOf(number).length());
	return square % digits == number ? "Automorphic" : "Not!!";
    }
}
