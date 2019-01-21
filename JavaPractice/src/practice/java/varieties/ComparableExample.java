/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class ComparableExample {

	static class Person implements Comparable<Person> {

		private int id;

		public Person(int id) {
			this.id = id;
		}

		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			return id - o.id;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person(1);
		Person p1 = new Person(2);
		System.out.println(p.compareTo(p1));

	}

}
