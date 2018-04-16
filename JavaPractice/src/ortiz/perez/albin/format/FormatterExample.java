package ortiz.perez.albin.format;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterExample {

    public static void main(String[] args) {

	Calendar c = Calendar.getInstance();

	Formatter f = new Formatter();
	f.format("Hello %s", "Albin");// formats a string %s
	System.out.println(f);

	f.format(" %c", 'a');// formats a character %c
	System.out.println(f);

	f.format(" %d", 125);// formats an integer in decimal format %d
	System.out.println(f);

	f.format(" %f", 126.0);// formats a float in decimal format %f
	System.out.println(f);

	f.format(" %e", 127.0);// formats a float in scientific notation %f
	System.out.println(f);

	f.format(" %g", 128.0);// formats a float in decimal format or
			       // scientific notation %g
	System.out.println(f);

	f.format(" %g", 129.00000008);// formats a float in decimal format or
				      // scientific notation %g
	System.out.println(f);

	f.format(" %o", 130);// formats an integer in octal %o
	System.out.println(f);

	f.format(" %x", 131);// formats an integer in hexadecimal %x
	System.out.println(f);

	f.format(" %a", 132.0);// formats an float in hexadecimal %a
	System.out.println(f);

	f.format(" %ty-%tm-%td %tl:%tM:%tS", c, c, c, c, c, c);// formats an
							       // float in
							       // hexadecimal %a

	f.format(" %, .2f", 123456789.0);// formats a floating point number
	System.out.println(f);

	f.close();// the formatter object must be closed to free resources

    }

}
