/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author Administrador
 *
 */
public class Test {

    public static void main(String args[]) {
	B b = new B();
	System.out.println(b instanceof B);
	System.out.println(b instanceof A);

	Class<?> x = b.getClass();

	System.out.println(x == B.class);
	b.doSomethingDifferent();
    }

}
