package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterErrors {
    public static void main(String[] args) {
	assertEquals("0/14", printerError("aaabbbbhaijjjm"));
	assertEquals("8/22", printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }

    public static String printerError(String s) {
	return s.chars().filter(t -> t > 109).count() + "/" + s.length();
    }

}
