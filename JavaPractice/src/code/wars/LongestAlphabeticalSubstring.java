package code.wars;

import java.util.Comparator;
import java.util.TreeSet;

public class LongestAlphabeticalSubstring {
    public static void main(String[] args) {
        System.out.println(longestAlphabeticalSubstring("nab"));
    }

    public static String longestAlphabeticalSubstring(String text) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
        StringBuilder stringBuilder = new StringBuilder();
        char first = text.charAt(0);
        stringBuilder.append(first);
        for (int i = 1; i < text.length(); i++) {
            if (first > text.charAt(i)) {
                set.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            first = text.charAt(i);
            stringBuilder.append(first);
        }
        set.add(stringBuilder.toString());
        return set.last();
    }
}
