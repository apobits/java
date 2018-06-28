import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author apobits@gmail.com
 *
 */
public class Solution {

    public static int calculateFine(LocalDate returnedDate, LocalDate dueDate) {

	if (returnedDate.compareTo(dueDate) <= 0) {
	    return 0;
	} else if (returnedDate.getMonth() == dueDate.getMonth() && returnedDate.getYear() == dueDate.getYear()) {
	    return 15 * (returnedDate.getDayOfMonth() - dueDate.getDayOfMonth());
	} else if (returnedDate.getYear() == dueDate.getYear()) {
	    return 500 * (returnedDate.getMonthValue() - dueDate.getMonthValue());
	} else {
	    return 10000;
	}
    }

    public static void main(String[] args) {

	try (Scanner scan = new Scanner(System.in)) {
	    int rDay = scan.nextInt();
	    int rMonth = scan.nextInt();
	    int rYear = scan.nextInt();
	    int dDay = scan.nextInt();
	    int dMonth = scan.nextInt();
	    int dYear = scan.nextInt();

	    LocalDate dueDate = LocalDate.of(dYear, dMonth, dDay);
	    LocalDate returnedDate = LocalDate.of(rYear, rMonth, rDay);
	    System.out.println(calculateFine(returnedDate, dueDate));

	}

    }

}
