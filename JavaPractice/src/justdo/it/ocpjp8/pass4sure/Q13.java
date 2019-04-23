/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

/**
 * @author aposo
 *
 */
public class Q13 {

	static class Product<T, U extends T> {

	}

	public static void main(String[] args) {
		Product<Number, Integer> product = new Product<Number, Integer>();
//		Product<Number, String> product1 = new Product<Number, String>();//bound mismatch 
	}

}
