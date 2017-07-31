/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class ExceptionTest1 {
	
	public void doSomething(){
		System.out.println(getClass().getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ExceptionTest1().doSomething();
		int z = 0;
		for (int i = 0; i < 10; i++) {
			try {
				z = i / (i % 10);
			} catch (Exception e) {
				System.out.println(e);
				z = 0;
			}
			System.out.println(z);
		}
	}

}
