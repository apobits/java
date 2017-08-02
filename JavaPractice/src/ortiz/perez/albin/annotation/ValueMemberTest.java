/**
 * 
 */
package ortiz.perez.albin.annotation;

/**
 * @author Administrador
 *
 */
@ValueMember("Albin")
public class ValueMemberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<?> objectClass = ValueMemberTest.class;

		System.out.println(objectClass.getAnnotation(ValueMember.class).value() + " "
				+ objectClass.getAnnotation(ValueMember.class).lastName());

	}

}
