/**
 * 
 */
package ortiz.perez.albin.format;

import java.text.DecimalFormat;

/**
 * @author apobits@gmail.com
 *
 */
public class DecimalFormatExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	// Formatting a float value with 2 decimals to the right
	DecimalFormat f = new DecimalFormat("####.##");
	System.out.println(f.format(123456.789f));
    }

}
