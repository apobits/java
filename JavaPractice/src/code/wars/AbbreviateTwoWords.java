package code.wars;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
	assertEquals("A.P", abbrevName("Albin Perez"));
    }

    public static String abbrevName(String name) {
	return Arrays.stream(name.split(" ")).map(t -> t.substring(0, 1).toUpperCase())
			.collect(Collectors.joining("."));
    }
}
