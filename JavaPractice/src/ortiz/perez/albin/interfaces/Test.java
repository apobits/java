/**
 * 
 */
package ortiz.perez.albin.interfaces;

/**
 * @author aposo
 *
 */
public class Test implements PackageInterface{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i1 = new A();
		Interface2 i2 = new A();
		PublicInterface pi = new A();
		
		A newA = new A();
		B newB = new B();
				
		i1.hello(HELLO);
		i2.world(WORLD);
		pi.hello(HELLO);
		pi.world(WORLD);
		
		System.out.println("\n");
		
		pi = newA;
		pi.hello(HELLO);
		pi.world(WORLD);
		
		System.out.println("\n");
		
		pi = newB;
		pi.hello(HELLO);
		pi.world(WORLD);
	}

}
