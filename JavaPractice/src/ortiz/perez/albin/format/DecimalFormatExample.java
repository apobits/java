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
	String temp = f.format(8.516f);
	int length = 0;
	int index = temp.indexOf(",");
	if (index == -1) {
	    length = temp.length() + 2;
	} else {
	    length = index + 2;
	    temp.replaceAll(",", "");
	}
	System.out.println(temp);
    }
}
