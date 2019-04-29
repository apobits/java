/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Test1 {
	interface AdvancedArithmetic {
		int divisorSum(int n);
	}

	static class Calculator implements AdvancedArithmetic {

		public int divisorSum(int n) {
			int sum = 1;
			for (int i = 1; i < n; i++) {
				double d = n / (double) i;
				String temp[] = String.valueOf(d).split("\\.");
				if (temp[1].equals("0")) {
					sum += d;
				}
			}
			return sum;
		}

	}

	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		scan.close();
//
//		AdvancedArithmetic myCalculator = new Calculator();
//		int sum = myCalculator.divisorSum(n);
//		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
//		System.out.println(sum);

	}

}
