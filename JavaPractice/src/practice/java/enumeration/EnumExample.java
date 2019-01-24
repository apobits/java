/**
 * 
 */
package practice.java.enumeration;

import ortiz.perez.albin.enums.A;

/**
 * @author aposo
 *
 */
public class EnumExample {

	// all enumerations automatically inherit Enum
	enum Vowels {
		A("a"), E("e"), I("i"), O("o"), U("u");

		private String lowerCase;

		private Vowels(String lowerCase) {
			this.lowerCase = lowerCase;
		}

		private Vowels() {
			this.lowerCase = null;
		}

		public String getLowerCase() {
			return lowerCase;
		}

	}

	public static void main(String args[]) {
		// comparing enumerations
		System.out.println(Vowels.A.equals(Vowels.A));
		Vowels a = Vowels.A;
		System.out.println(a == Vowels.A);

		// obtaining instance variables
		System.out.println(a.getLowerCase());

		// getting the ordinal value (position)
		System.out.println(a.ordinal());

		// comparing ordinal values
		System.out.println(a.compareTo(Vowels.A));

		// Obtains a constant from the string parameter
		System.out.println(A.valueOf("A"));

		// Obtains a constant form a type and a string parameter
		System.out.println(Enum.valueOf(Vowels.class, "A"));

		// getting the declared class of an enumeration
		System.out.println(a.getDeclaringClass());

		// gets the name of this enum constant
		System.out.println(a.name());
	}

}
