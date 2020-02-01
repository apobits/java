package code.wars;

import java.util.Collections;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovesInSquaredStrings {

    private static final String NEW_LINE = "\n";

    public static String vertMirror(String str) {
	return Stream.of(str.split(NEW_LINE)).map(t -> new StringBuilder(t).reverse().toString())
			.collect(Collectors.joining(NEW_LINE));
    }

    public static String horMirror(String str) {
	var list = Stream.of(str.split(NEW_LINE)).collect(Collectors.toList());
	Collections.reverse(list);
	return list.stream().collect(Collectors.joining(NEW_LINE));
    }

    public static String oper(UnaryOperator<String> operator, String s) {
	return operator.apply(s);
    }

}
