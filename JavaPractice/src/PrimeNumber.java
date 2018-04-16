import java.util.Scanner;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class PrimeNumber {

	public static boolean isPrime(int number) {
		if (number==1)
			return false;
		double sqrt = Math.sqrt(number);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < size; i++) {
			if (isPrime(numbers[i]))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}

}
