/**
 * 
 */
package ortiz.perez.albin.object;

/**
 * @author Administrador
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		Integer i = new Integer(1);
		A a = new A();
		try {
			Thread.sleep(10000);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("s object " + s);
		System.out.println("i object " + i);
		System.out.println("a object " + a);
		System.out.println(a.getClass());
	}

}
