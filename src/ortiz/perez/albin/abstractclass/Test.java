/**
 * 
 */
package ortiz.perez.albin.abstractclass;

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
		Person x = new Athlete();
		System.out.print("Athlete: ");
		x.run();

		x = new Common();
		System.out.print("Common: ");
		x.run();
	}

}
