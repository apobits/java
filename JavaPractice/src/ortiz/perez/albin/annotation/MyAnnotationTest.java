/**
 * 
 */
package ortiz.perez.albin.annotation;

/**
 * @author aposo
 *
 */
@MyAnnotation
public class MyAnnotationTest {

    public void printAnnotationInfo() {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	MyAnnotationTest t = new MyAnnotationTest();
	Class<?> c = t.getClass();
	MyAnnotation a = c.getAnnotation(MyAnnotation.class);
	System.out.println(a.name());

    }

}
