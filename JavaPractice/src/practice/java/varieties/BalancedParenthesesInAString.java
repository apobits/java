package practice.java.varieties;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancedParenthesesInAString {

    public static void main(String[] args) {
	assertEquals(false, isBalanced("{[(]}())"));
    }

    public static boolean isBalanced(String s) {
	var linkedList = new LinkedList<String>();
	var map = new HashMap<String, String>();
	map.put(")", "(");
	map.put("}", "{");
	map.put("]", "[");

	for (String string : s.split("")) {
	    if (isOpen(string)) {
		linkedList.push(string);
	    } else {
		if (linkedList.isEmpty() || !linkedList.pop().equals(map.get(string))) {
		    return false;
		}
	    }
	}
	return linkedList.isEmpty() ? true : false;
    }

    private static boolean isOpen(String c) {
	switch (c) {
	case "{":
	case "(":
	case "[":
	    return true;
	}
	return false;
    }

}
