package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsEncoder {
    private static final String ONE = "I";
    private static final String TWO = "II";
    private static final String THREE = "III";
    private static final String FOUR = "IV";
    private static final String FIVE = "V";
    private static final String SIX = "VI";
    private static final String SEVEN = "VII";
    private static final String EIGHT = "VIII";
    private static final String NINE = "IX";
    private static final String TEN = "X";
    private static final String TWENTY = "XX";
    private static final String THIRTY = "XXX";
    private static final String FORTY = "XL";
    private static final String FIFTY = "L";
    private static final String SIXTY = "LX";
    private static final String SEVENTY = "LXX";
    private static final String EIGHTY = "LXXX";
    private static final String NINETY = "XC";
    private static final String ONE_HUNDRED = "C";
    private static final String TWO_HUNDRED = "CC";
    private static final String THREE_HUNDRED = "CCC";
    private static final String FOUR_HUNDRED = "CD";
    private static final String FIVE_HUNDRED = "D";
    private static final String SIX_HUNDRED = "DC";
    private static final String SEVEN_HUNDRED = "DCC";
    private static final String EIGHT_HUNDRED = "DCCC";
    private static final String NINE_HUNDRED = "CM";
    private static final String ONE_THOUSAND = "M";
    private static final String TWO_THOUSAND = "MM";
    private static final String THREE_THOUSAND = "MMM";

    public static void main(String[] args) {
	//	assertEquals("II", solution(2));
	//	assertEquals("VII", solution(7));
	//	assertEquals("XX", solution(20));
	//	assertEquals("X", solution(10));
	//	assertEquals("M", solution(1000));
	//	assertEquals("CMXC", solution(990));
	//	assertEquals("MMMDCCXII", solution(3712));
	assertEquals("CCXVIII", solution(218));
    }

    public static String solution(int n) {
	String number = String.valueOf(n);
	int counter = 0;
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = number.length() - 1; i > -1; i--) {
	    String digit = number.substring(i, i + 1);
	    counter++;
	    if (digit.equals("0")) {
		continue;
	    }
	    stringBuilder.insert(0, getStringRomanDigit(Integer.valueOf(digit), counter));
	}
	return stringBuilder.toString();
    }

    private static String getStringRomanDigit(int digit, int pos) {

	switch (digit) {
	case 1:
	    switch (pos) {
	    case 1:
		return ONE;
	    case 2:
		return TEN;
	    case 3:
		return ONE_HUNDRED;
	    case 4:
		return ONE_THOUSAND;

	    }
	case 2:
	    switch (pos) {
	    case 1:
		return TWO;
	    case 2:
		return TWENTY;
	    case 3:
		return TWO_HUNDRED;
	    case 4:
		return TWO_THOUSAND;
	    }
	case 3:
	    switch (pos) {
	    case 1:
		return THREE;
	    case 2:
		return THIRTY;
	    case 3:
		return THREE_HUNDRED;
	    case 4:
		return THREE_THOUSAND;
	    }
	case 4:
	    switch (pos) {
	    case 1:
		return FOUR;
	    case 2:
		return FORTY;
	    case 3:
		return FOUR_HUNDRED;
	    }
	case 5:
	    switch (pos) {
	    case 1:
		return FIVE;
	    case 2:
		return FIFTY;
	    case 3:
		return FIVE_HUNDRED;
	    }
	case 6:
	    switch (pos) {
	    case 1:
		return SIX;
	    case 2:
		return SIXTY;
	    case 3:
		return SIX_HUNDRED;
	    }
	case 7:
	    switch (pos) {
	    case 1:
		return SEVEN;
	    case 2:
		return SEVENTY;
	    case 3:
		return SEVEN_HUNDRED;
	    }
	case 8:
	    switch (pos) {
	    case 1:
		return EIGHT;
	    case 2:
		return EIGHTY;
	    case 3:
		return EIGHT_HUNDRED;
	    }
	case 9:
	    switch (pos) {
	    case 1:
		return NINE;
	    case 2:
		return NINETY;
	    case 3:
		return NINE_HUNDRED;
	    }
	default:
	    return "";
	}

    }

}
