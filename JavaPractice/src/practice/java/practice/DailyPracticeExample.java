package practice.java.practice;

import java.util.*;

/**
 * @author apobits@gmail.com
 */

public class DailyPracticeExample {

    public static void main(String[] args) {
	System.out.println(Integer.parseInt("111111111111", 2));
	//	System.out.println(Integer.parseInt(makeBits(new ArrayList<>(Arrays.asList(0, 2))), 2));
    }

    public static List<Integer> sortBinaryNumbers(List<List<Integer>> bitArrays) {
	Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
	for (int i = 0; i < bitArrays.size(); i++) {
	    map.put(Integer.parseInt(makeBits(bitArrays.get(i)), 2), i);
	}
	return new ArrayList<>((map.values()));
    }

    private static String makeBits(List<Integer> list) {
	Collections.sort(list);
	int size = list.get(list.size() - 1);
	StringBuilder bitsSB = makeSBWithZeros(size);
	for (Integer x : list) {
	    bitsSB.insert(bitsSB.length() - x, 1);
	}
	return bitsSB.toString();
    }

    private static StringBuilder makeSBWithZeros(int length) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < length; i++) {
	    stringBuilder.append("0");
	}
	return stringBuilder;
    }

}
