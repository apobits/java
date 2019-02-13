package practice.java.varargs;

public class VarArgExample {

	public static void print(String... words) {
		for (String x : words) {
			System.out.print(x + " ");
		}
	}

	// Valid overloaded method
	public static void print(int a, String... words) {
		for (String x : words) {
			System.out.print(x + " ");
		}
	}

	// ambiguous method
//	public static void print(String a,String... words) {
//		for (String x : words) {
//			System.out.print(x + " ");
//		}
//	}

	public static void print(int... a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void main(String args[]) {
		print("World");
		// print();//ambiguous method

		// passing an array of strings to the var args parameter
		print(new String[] { "Hello", "there" });

	}

}
