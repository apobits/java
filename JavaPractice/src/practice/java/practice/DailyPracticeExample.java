package practice.java.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author apobits@gmail.com
 */

public class DailyPracticeExample {

    public static void main(String[] args) throws Exception {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:MM:ss");
	System.out.println(simpleDateFormat.format(new Date()));

    }

}
