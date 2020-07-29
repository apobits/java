package hackerrank.java.introduction;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaDateAndTime {
    public static void main(String[] args) {
	//	assertEquals("Monday", findDay(8, 14, 2017));
	System.out.println(findDay(8, 14, 2017));

    }

    public static String findDay(int month, int day, int year) {
	return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase();
    }
}
