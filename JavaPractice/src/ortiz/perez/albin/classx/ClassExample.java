/**
 * 
 */
package ortiz.perez.albin.classx;

/**
 * @author aposo
 *
 */
public class ClassExample {
    
    static class A{
	
    }
    
    static class B extends A{
	
    }

    /**
     * @param args
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws ClassNotFoundException {
	
	System.out.println(new B().getClass().getName());
	
	System.out.println(new B().getClass().getSuperclass().getName());
	
	System.out.println(Class.forName("ortiz.perez.albin.classx.ClassExample$A").getName());

    }

}
