package hackerrank.java.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstringComparison {
    public static void main(String[] args) {
	System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    private static List<String> createSubstrings(String word, int length) {
	List<String> words = new ArrayList<>();
	for (int i = 0; i < word.length() - (length - 1); i++) {
	    words.add(word.substring(i, length + i));
	}
	return words;
    }

    public static String getSmallestAndLargest(String s, int k) {
	List<String> words = createSubstrings(s, k);
	Collections.sort(words);
	return words.get(0) + "\n" + words.get(words.size() - 1);
    }

}
