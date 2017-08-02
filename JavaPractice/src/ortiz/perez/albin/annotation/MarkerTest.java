/**
 * 
 */
package ortiz.perez.albin.annotation;

/**
 * @author Administrador
 *
 */
@Marker
public class MarkerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> objectClass = new MarkerTest().getClass();
		System.out.print("Is @Marker present at class: ");
		System.out.println(objectClass.isAnnotationPresent(Marker.class));

	}

}
