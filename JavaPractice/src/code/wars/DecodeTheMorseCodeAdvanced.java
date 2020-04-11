package code.wars;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecodeTheMorseCodeAdvanced {

    public static void main(String[] args) {
		//	System.out.println(
	//			decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
	//	System.out.println(getTimeUnit("1100110011110000"));
    }

    public static String decodeBits(String bits) {
	bits = trimZeros(bits);
	StringBuilder stringBuilder = new StringBuilder();
	int zeroCounter = 0, oneCounter = 0;
	int timeUnit = getTimeUnit(bits);
	for (int i = 0; i < bits.length(); i++) {
	    if (bits.charAt(i) == 48) {
		zeroCounter++;
		if (oneCounter != 0) {
		    stringBuilder.append(getMorseCode(false, oneCounter, timeUnit));
		    oneCounter = 0;
		}
	    } else {
		oneCounter++;
		if (zeroCounter != 0) {
		    stringBuilder.append(getMorseCode(true, zeroCounter, timeUnit));
		    zeroCounter = 0;
		}
	    }
	}
	if (oneCounter != 0) {
	    stringBuilder.append(getMorseCode(false, oneCounter, timeUnit));
	}
	if (zeroCounter != 0) {
	    stringBuilder.append(getMorseCode(true, zeroCounter, timeUnit));
	}

	return stringBuilder.toString();
    }

    private static String trimZeros(String msg) {
	if (msg.length() < 2) {
	    return msg;
	}
	int start = 0;
	int end = msg.length();
	for (int i = 0; i < msg.length(); i++) {
	    if (msg.charAt(i) == '1') {
		start = i;
		break;
	    }
	}
	for (int i = msg.length() - 1; i > 0; i--) {
	    if (msg.charAt(i) == '1') {
		end = i;
		break;
	    }
	}
	return msg.substring(start, end + 1);
    }

    private static String getMorseCode(boolean zero, int counter, int timeUnit) {
	if (zero) {
	    if (counter == (1 * timeUnit)) {
		return "";
	    } else if (counter == (3 * timeUnit)) {
		return " ";
	    } else {
		return "   ";
	    }
	} else if (counter == (1 * timeUnit)) {
	    return ".";
	} else {
	    return "-";
	}

    }

    private static int getTimeUnit(String message) {
	String[] ones = message.split("0+");
	TreeSet<String> onesSet = new TreeSet<String>(Arrays.asList(ones));
	TreeSet<String> zerosSet = Stream.of(message.split("1+")).filter(t -> t.length() > 0)
			.collect(Collectors.toCollection(() -> new TreeSet<String>()));
	if (onesSet.size() == 2) {
	    return onesSet.first().length();
	} else if (!zerosSet.isEmpty()) {
	    if (onesSet.first().length() == zerosSet.first().length()) {
		return onesSet.first().length();
	    }
	    if (onesSet.first().length() > zerosSet.first().length()) {
		return zerosSet.first().length();
	    } else {
		return onesSet.first().length();
	    }
	}

	return onesSet.first().length();
    }

}
