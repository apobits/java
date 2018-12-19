/**
 * 
 */
package ortiz.perez.albin.finalx;

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
	FinalClass a = new FinalClass();
	a.doSomething();

	C c = new C();
	//revise if the value of hi in C class hides the value of hi in class B
	System.out.println(c.hi);
	
	new B().doSomething("hisi");
    }

}
