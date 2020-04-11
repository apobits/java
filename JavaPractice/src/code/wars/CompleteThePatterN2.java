package code.wars;

import java.util.Arrays;

public class CompleteThePatterN2 {

    public static void main(String[] args) {
	System.out.println(pattern(12));
    }

    public static String pattern(int n) {
	StringBuilder resultSB = new StringBuilder();
	StringBuilder accumulateSB = new StringBuilder();

	for (int i = n; i > 0; i--) {
	    accumulateSB.append(i);
	    if (resultSB.length() == 0) {
		resultSB.append(accumulateSB);
	    } else {
		resultSB.insert(0, "\n");
		resultSB.insert(0, accumulateSB);
	    }
	}

	return resultSB.toString();
    }

}
