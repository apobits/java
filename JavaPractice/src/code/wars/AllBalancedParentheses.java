package code.wars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllBalancedParentheses {
    public static void main(String[] args) {
	System.out.println(balancedParens(4));
    }

    public static List<String> balancedParens(int n) {
	var data = new String[n];
	for (int i = 0; i < n; i++) {
	    data[i] = i % 2 == 0 ? "(" : ")";
	}
	System.out.println(Arrays.toString(data));
	return null;
    }

}
