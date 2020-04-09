package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllStartCodeChallenge {

    public static void main(String[] args) {
	assertEquals(3, strCount("Hlello", 'l'));
    }

    public static int strCount(String str, char letter) {
	int counter = 0;
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == letter) {
		counter++;
	    }
	}
	return counter;
    }

}
