/**
 * 
 */
package ortiz.perez.albin.reader;

/**
 * @author Administrador
 *
 */
public class Test {

	char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	static String letter;

	enum UserCategory {
		WEBUSER("WEBUSER"), SPECIAL("SPECIAL"), AGENT("AGENT");

		private String value;

		private UserCategory(String value) {
			this.value = value;
		}

		public String value() {
			return this.value;
		}

		public static UserCategory fromValue(String v) {
			for (UserCategory c : values()) {
				if (c.value.equals(v)) {
					return c;
				}
			}
			throw new IllegalArgumentException(v);
		}
	}

	private String name = "";

	public Test() {

	}

	public void printVocals(int i) {
		if (i == 0)
			System.out.println("Finished");
		else {
			System.out.println(vowels[--i]);
			printVocals(i);
		}
	}

	static {
		letter = "Albin";
	}

	public static void main(String args[]) {
		// System.out.println(UserCategory.fromValue("AGENT").toString());
		// for (int i = 0; i < 10; i++) {
		// switch (i) {
		// case 1:
		// ;
		// case 2:
		// ;
		// case 3:
		// ;
		// case 4:
		// ;
		// case 5:
		// System.out.println(i + "<= 5");
		// break;
		// }
		// }
		// Test t1 = new Test();
		// Test t2;
		// t1.setName("Albin");
		// t2 = t1;
		// t2.setName("Danna");
		// System.out.println(t1.getName());
		// int x=0;
		// for (int i = 0; i < 2; i++) {
		// x++;
		// switch(x){
		// case 0:System.out.println(x);break;
		// case 1:System.out.println(x);break;
		// case 2:System.out.println(x);break;
		// case 3:System.out.println(x);break;
		//
		// }
		// }
		// Test t = new Test();
		// t.printVocals(t.vowels.length);
		System.out.println(letter);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
