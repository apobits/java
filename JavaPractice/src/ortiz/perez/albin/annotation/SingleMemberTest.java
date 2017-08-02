/**
 * 
 */
package ortiz.perez.albin.annotation;

/**
 * @author Administrador
 *
 */
@SingleMember("AlbinPerez")
public class SingleMemberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class<?> object = new SingleMemberTest().getClass();
		
		System.out.println(object.getAnnotation(SingleMember.class).value());

	}

}
