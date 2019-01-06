/**
 * 
 */
package practice.java.enumeration;

/**
 * @author aposo
 *
 */
public class EnumExample {

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
	}

}
