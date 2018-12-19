/**
 * 
 */
package ortiz.perez.albin.format;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author apobits@gmail.com
 *
 */
public class SimpleDateFormatExample {

	public static void main(String args[]) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHMMss");
		System.out.println(sdf.format(new Date()));
	}

}
