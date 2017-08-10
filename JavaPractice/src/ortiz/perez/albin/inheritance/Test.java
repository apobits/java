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

	Class<?> x = b.getClass();

	System.out.println(x == B.class);
    }

}
