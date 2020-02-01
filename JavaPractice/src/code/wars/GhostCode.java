package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GhostCode {
    public static void main(String[] args) {
	System.out.println("// \\u000d");
	assertEquals("Hello my name is Javalll", helloName("Javalll"));

    }

    public static String helloName(final String name) {
	if (name == null || name.equals("") || name.equals("dumb"))
	    return "Hello world!";
	else
	    return "Hello my name is " + name;
    }

}
