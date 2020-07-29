package hackerrank.java.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int lines = scanner.nextInt();
	    scanner.nextLine();
	    while (lines-- > 0) {
		List<String> contents = new ArrayList<>(tagContentExtractor(scanner.nextLine()));
		if (contents.isEmpty()) {
		    System.out.println("None");
		} else {
		    contents.forEach(t -> System.out.println(t));
		}
	    }
	}
    }

    private static List<String> tagContentExtractor(String line) {
	String regex = "<(.+)>[^<]+</\\1>";
	List<String> contents = new ArrayList<>();
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(line);
	while (matcher.find()) {
	    String group = matcher.group();
	    contents.add(group.substring(group.indexOf(">") + 1, group.lastIndexOf("<")));
	}
	return contents;
    }
}
