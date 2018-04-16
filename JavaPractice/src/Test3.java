import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Test3 {

    static int[] solve(int[] grades) {
	for (int i = 0; i < grades.length; i++) {
	    int temp = nextMultipleOfFive(grades[i]);
	    grades[i] = grades[i] >= 38 && Math.abs(grades[i] - temp) < 3 ? temp : grades[i];
	}
	return grades;
    }

    static int nextMultipleOfFive(int number) {
	while (number % 5 != 0) {
	    number++;
	}
	return number;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] grades = new int[n];
	for (int grades_i = 0; grades_i < n; grades_i++) {
	    grades[grades_i] = in.nextInt();
	}
	int[] result = solve(grades);
	for (int i = 0; i < result.length; i++) {
	    System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	}
	System.out.println("");
	in.close();
    }

}
