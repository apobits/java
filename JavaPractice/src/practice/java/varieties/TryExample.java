/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class TryExample {

	public static void tryMethod() throws Exception {
		try {
			throw new Exception("Main exception ");
		} catch (Exception e) {

		} finally {
			boolean flag = true;
			if (flag)
				throw new Exception("Second exception ");
		}
	}

	public static void tryWithReturn() {
		try {
			boolean flag = true;
			if (flag)
				return;
		} finally {
			System.out.println("Finally blocked executed before method returns ");
		}
		System.out.println("This won't be printed, unreachable code");
	}

	public static void tryWithContinue() {
		int i = 0;
		cont: for (; i < 5; i++) {
			{
				try {
					continue cont;
				} finally {
					System.out.println("In finally block before continue returns");
				}
			}
		}

	}

	public static void tryWithBreak() {
		cont: while (true) {
			{
				try {
					break cont;
				} finally {
					System.out.println("In finally block before breaks returns");
				}
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		tryWithContinue();
		tryWithReturn();
		tryWithBreak();

//		try {
//			tryMethod();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

	}

}
