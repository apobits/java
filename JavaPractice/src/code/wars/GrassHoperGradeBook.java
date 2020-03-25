package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHoperGradeBook {
    public static void main(String[] args) {
	assertEquals('E', getGrade(26, 90, 93));
    }

    public static char getGrade(int s1, int s2, int s3) {
	var average = (s1 + s2 + s3) / 3;
	if (90 <= average && average <= 100) {
	    return 'A';
	} else if (80 <= average && average < 90) {
	    return 'B';
	} else if (70 <= average && average < 80) {
	    return 'C';
	} else if (60 <= average && average < 70) {
	    return 'D';
	} else {
	    return 'F';
	}
    }
}
