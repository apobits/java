/**
 * 
 */
package ortiz.perez.albin.doubles;

/**
 * @author Administrador
 *
 */
public class DoubleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double a = new Double(1);
		Double b = new Double(2);
		Double c = new Double(1);

		System.out.println("a equals b = " + a.equals(b));
		System.out.println("a equals c = " + a.equals(c));

		System.out.println("a hashcode = " + a.hashCode());
		System.out.println("b hashcode = " + b.hashCode());
		System.out.println("c hashcode = " + c.hashCode());

	}

}
