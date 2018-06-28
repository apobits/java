import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Class description
 * 
 * @author
 * @version
 * @since
 */
public class Test {

    static class Person {
	boolean flag = false;
    }

    public static void changeObjectInfo(Person person) {
	person.flag = false;
    }

    public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	BigDecimal b = new BigDecimal("1.0");
	String temp = df.format(b);
	try {
	    df.parse(temp);
	} catch (ParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	// Calendar c = new GregorianCalendar();
	// c.set(Calendar.DAY_OF_YEAR, 256);
	// c.set(Calendar.YEAR, 1918);
	// System.out.println(c.getTime());
	//
	// Person p = new Person();
	// p.flag = true;
	// changeObjectInfo(p);
	//
	// System.out.println(p.flag);
    }

}
