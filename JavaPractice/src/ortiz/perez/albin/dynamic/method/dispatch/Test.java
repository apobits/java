/**
 * 
 */
package ortiz.perez.albin.dynamic.method.dispatch;

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
		A a = new A();
		B b = new B();
		A c;
		
		a.sayHello();
		b.sayHello();
		
		c=b;
		c.sayHello();
		
		
	}

}
