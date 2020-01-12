package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoder {
    public static void main(String[] args) {
	assertEquals("(((", encode("din"));
	assertEquals("()()()", encode("recede"));
	assertEquals(")())())", encode("Success"));
	assertEquals("))((", encode("(( @"));
    }

    static String encode(String word) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < word.length(); i++) {
	    int counter = 0;
	    for (int j = 0; j < word.length(); j++) {
		if (word.substring(i, i + 1).equalsIgnoreCase(word.substring(j, j + 1))) {
		    counter++;
		}
	    }
	    if (counter > 1) {
		stringBuilder.append(")");
	    } else {
		stringBuilder.append("(");
	    }
	}
	return stringBuilder.toString();
    }
}
