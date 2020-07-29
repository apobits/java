package hackerrank.java.introduction;

import java.util.Arrays;

public class JavaAnagrams {
    public static void main(String[] args) {
	System.out.println(isAnagram("anagramm", "marganaa"));
    }

    public static boolean isAnagram(String a, String b) {
	String[] as = a.toLowerCase().split("");
	String[] bs = b.toLowerCase().split("");

	Arrays.sort(as);
	Arrays.sort(bs);

	return Arrays.equals(as, bs);
    }

}
