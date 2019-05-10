/**
 * 
 */
package practice.java.number;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author aposo
 *
 */
public class BigDecimalExample {

	public static void main(String[] args) {

		// one of its uses is when you need to avoid inconsistency with rounding
		// operations
		// for example:

		// does not round exactly
		System.out.println(2.0 - 1.1);

		// rounds exactly
		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2, MathContext.DECIMAL32));

	}

}
