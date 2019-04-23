/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q48 {

	void display(String[] arr) {
		try {
			System.out.print(arr[2]);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
//			e = new Exception();
			throw e;
		}
	}

	public static void main(String[] args) {

		try {
			String arr[] = { "Unix", "Solaris", null };
			new Q48().display(arr);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}

	}

}
