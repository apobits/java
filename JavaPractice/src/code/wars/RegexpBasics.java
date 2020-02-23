package code.wars;

public class RegexpBasics {
    public static void main(String[] args) {
	System.out.println(eightBitNumber("99"));
    }

    public static boolean eightBitNumber(String n) {
	System.out.println(n);
	return n.matches("0|[1-9]\\d?|1\\d?\\d?|2[0-4]\\d?|2[0-5]{1,2}");
    }
}
