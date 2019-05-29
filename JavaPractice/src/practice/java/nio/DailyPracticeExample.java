/**
 * 
 */
package practice.java.nio;

/**
 * @author apobits@gmail.com
 * 
 *
 */
class DailyPracticeExample {

	private static class Box<T> {

		T t;

		public void set(T t) {
			this.t = t;
		}

		public T get() {
			return t;
		}

	}

	public static void main(String args[]) {

		Box<String> boxS = new Box<>();
		Box box = boxS;
		box.set(2);
		boxS=box;
		
		System.out.println(boxS.get());
		

	}

}
