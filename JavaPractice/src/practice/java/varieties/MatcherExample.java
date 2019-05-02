package practice.java.varieties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

	public static void main(String args[]) {
		Matcher matcher = Pattern.compile("^[a-z]+.java$").matcher("hh.java");
		System.out.println(matcher.matches());
	}

}
