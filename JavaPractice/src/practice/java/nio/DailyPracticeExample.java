/**
 *
 */
package practice.java.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author apobits@gmail.com
 *
 *
 */

public class DailyPracticeExample {

    public static void main(String[] args) throws IOException {
	var a = new int[] { 3, 2, 1, 5 };
	var b = new int[] { 7, 9, 8, 6 };
	var number = 15;

	assertEquals("5,9", closestSumPairV2(a, b, number));

    }

    public static String closestSumPairV2(int[] a, int[] b, int number) {
	Arrays.sort(a);
	Arrays.sort(b);

	var left = 0;
	var right = a.length - 1;
	String resultString = null;
	Integer resultNumber = null;

	while (left < a.length && right >= 0) {
	    var sum = a[left] + b[right];
	    var string = a[left] + "," + b[right];
	    if (sum == number) {
		return string;
	    } else if (sum < number) {
		left++;
	    } else {
		right--;
	    }
	    if (resultNumber != null) {
		if ((sum > resultNumber && resultNumber < number) || (sum < resultNumber && resultNumber > number)) {
		    resultNumber = sum;
		    resultString = string;
		}
	    } else {
		resultNumber = sum;
		resultString = string;
	    }
	}
	return resultString;
    }

    public static String closestSumPair(int[] a, int[] b, int number) {
	var map = new HashMap<Integer, String>();
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < b.length; j++) {
		var sum = Math.abs(a[i] + b[j]);
		var result = a[i] + "," + b[j];
		if (sum == number) {
		    return result;
		} else {
		    map.merge(a[i] + b[j], result, (t, u) -> u);
		}
	    }
	}

	if (map.get(number) != null) {
	    return map.get(number);
	}

	var left = a.length * b.length;
	var leftIndex = number;
	while (left-- > 0) {
	    if (map.get(leftIndex) != null) {
		left = leftIndex;
		break;
	    }
	    leftIndex--;
	}

	var right = a.length * b.length;
	var rightIndex = number;
	while (right-- > 0) {
	    if (map.get(rightIndex) != null) {
		right = rightIndex;
	    }
	    rightIndex++;
	}
	return Math.abs(number - leftIndex) < Math.abs(number - rightIndex) ? map.get(leftIndex) : map.get(rightIndex);
    }

}

