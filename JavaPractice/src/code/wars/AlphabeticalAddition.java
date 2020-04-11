package code.wars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabeticalAddition {
    private static Map<String, Integer> letterss = new HashMap<>();

    static {
	letterss.put("a", 1);
	letterss.put("b", 2);
	letterss.put("c", 3);
	letterss.put("d", 4);
	letterss.put("e", 5);
	letterss.put("f", 6);
	letterss.put("g", 7);
	letterss.put("h", 8);
	letterss.put("i", 9);
	letterss.put("j", 10);
	letterss.put("k", 11);
	letterss.put("l", 12);
	letterss.put("m", 13);
	letterss.put("n", 14);
	letterss.put("o", 15);
	letterss.put("p", 16);
	letterss.put("q", 17);
	letterss.put("r", 18);
	letterss.put("s", 19);
	letterss.put("t", 20);
	letterss.put("u", 21);
	letterss.put("v", 22);
	letterss.put("w", 23);
	letterss.put("x", 24);
	letterss.put("y", 25);
	letterss.put("z", 26);
    }

    public static String addLetters(String... letters) {
	int sum = 0;
	for (String letter : letters) {
	    sum += letterss.get(letter);
	}
	if (sum > 26) {
	    sum = sum % 26;
	}
	if (sum > 0) {
	    int total = sum;
	    return letterss.entrySet().stream().filter(t -> t.getValue() == total).map(t -> t.getKey())
			    .collect(Collectors.joining());
	}
	return "z";
    }

    public static void main(String[] args) {
	assertEquals("f", addLetters("a", "b", "c"));
	assertEquals("z", addLetters("z"));
	assertEquals("c", addLetters("a", "b"));
	assertEquals("c", addLetters("c"));
	assertEquals("a", addLetters("z", "a"));
	assertEquals("d", addLetters("y", "c", "b"));
	assertEquals("z", addLetters());
    }
}
