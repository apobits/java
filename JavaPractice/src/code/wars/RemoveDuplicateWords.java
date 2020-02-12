package code.wars;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
	System.out.println(removeDuplicateWords(
			"alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

    public static String removeDuplicateWords(String s) {
	return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
