/**
 * 
 */
package ortiz.perez.albin.annotation;

/**
 * @author aposo
 *
 */
@Repetable(name = "Albin")
@Repetable(name = "Perez")
public class RepetableTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Class<?> objectClass = new RepetableTest().getClass();
	
	System.out.println(objectClass.getAnnotation(RepetableContainer.class));//return annotations by container
	
	System.out.println((Repetable)objectClass.getAnnotationsByType(Repetable.class)[0]);

    }

}
