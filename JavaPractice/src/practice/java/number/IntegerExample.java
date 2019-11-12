/**
 * 
 */
package practice.java.number;

/**
 * @author apobits@gmail.com
 *
 */
public class IntegerExample {

	public static void valueOf() {

		// values from -128 to 127 will always be cached
		// one, one1, one2 will always refer to the same instance
		Integer one = Integer.valueOf(1);
		Integer one1 = Integer.valueOf(1);
		Integer one2 = Integer.valueOf(1);

		// It may cached values outside the range -128 to 127
		Integer int1 = Integer.valueOf(128);
		Integer int2 = Integer.valueOf(128);
		Integer int3 = Integer.valueOf(128);

		// values won't be cached
		// two, two1, two2 will always refer to different instances
		Integer two = Integer.valueOf("2");
		Integer two1 = Integer.valueOf("2");
		Integer two2 = Integer.valueOf("2");

		// values won't be cached
		// The string will be parsed with the specified radix
		Integer three = Integer.valueOf("3", 10);
		Integer three1 = Integer.valueOf("3", 8);
		Integer three2 = Integer.valueOf("3", 16);

		System.out.println(one + " from valueOf(int i)");
		System.out.println(two + " from valueOf(String s)");
		System.out.println(three + " from valueOf(String s, int radix) with radix 10");
		System.out.println(three1 + " from valueOf(String s, int radix) with radix 8");
		System.out.println(three2 + " from valueOf(String s, int radix) with radix 16");

	}

	public static void parseInt() {

		// parses the specified string as a signed decimal integer
		Integer one = Integer.parseInt("1");

		// parses the specified string with the specified radix as a signed integer
		Integer two = Integer.parseInt("2", 8);

		// parses the specified string from(inclusive) to(exclusive) indexes with the
		// specified radix as a signed integer
		Integer three = Integer.parseInt("3", 0, 1, 10);

		// parses the specified string as a decimal unsigned integer
		Integer four = Integer.parseUnsignedInt("+2147483649");
		System.out.println("unsigned integer " + four);

		// same as above for signed examples
		Integer.parseUnsignedInt("3", 16);
		Integer.parseUnsignedInt("3", 0, 1, 10);

	}

	public static void decode() {
		// hexadecimal is base 16 which uses numbers from 0-9 and A-F or a-f to
		// represent values from 0 to 15
		System.out.println("+0xFF decoded is " + Integer.decode("+0xFF"));

		// Octal is base 8 which uses numbers from 0-7
		System.out.println("-07 decoded is " + Integer.decode("-07"));

		// Decimal is base 10 which uses numbers from 0-9
		System.out.println("+123 decoded is " + Integer.decode("+123"));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parseInt();
		decode();
		System.exit(0);
		valueOf();
	}
}
