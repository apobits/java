package practice.java.algorithm;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Permutation {
    public static void main(String[] args) {
	System.out.println(getPermutations("1234").size());
    }

    public static List<String> getPermutations(String number) {
	ArrayList<String> set = new ArrayList<String>();

	for (String x : prepareInitialNumbers(number)) {
	    String prefix = x.substring(0, 1);
	    String temp = x.substring(1);
	    if (temp.length() == 1) {
		set.add(prefix + temp);
	    } else {
		for (int i = 0; i < ((getFactorialSecondPractice(x.length()) / x.length()) / temp.length()) + 1; i++) {
		    for (int j = temp.length() - 1; j > 0; j--) {
			temp = temp.substring(0, j - 1) + temp.charAt(j) + temp.charAt(j - 1) + temp.substring(j + 1);
			set.add(prefix + temp);
		    }
		}
	    }
	}
	return set;
    }

    public static int getFactorialSecondPractice(int number) {

	if (number == 1) {
	    return number;
	} else {
	    return getFactorialSecondPractice(number - 1) * number;
	}
    }
    //
    //    private static String switchToLeft(String number) {
    //	var stringBuilder = new StringBuilder();
    //	for (int i = 1; i < number.length(); i++) {
    //	    stringBuilder.append(number.charAt(i));
    //	}
    //	stringBuilder.append(number.charAt(0));
    //	return stringBuilder.toString();
    //    }

    private static List<String> prepareInitialNumbers(String number) {
	ArrayList<String> list = new ArrayList<String>();
	for (int i = 0; i < number.length(); i++) {
	    String temp = number.substring(1) + number.substring(0, 1);
	    list.add(temp);
	    number = temp;
	}
	return list;
    }

}
