/**
 * 
 */
package ortiz.perez.albin.format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author apobits@gmail.com
 *
 */
public class SimpleDateFormatExample {

	public static void main(String args[]) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHMMss",Locale.getDefault());
		System.out.println(sdf.format(new Date()));
	}

}
