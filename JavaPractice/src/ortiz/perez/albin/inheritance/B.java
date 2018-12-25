/**
 * 
 */
package ortiz.perez.albin.inheritance;

/**
 * @author Administrador
 *
 */
public class B extends A {

    public B() {
	// super class constructor must be in the first line of subclass constructor
	super(0, "b", 'c');
	System.out.println("B class constructor called");
    }
    
    public B(B b) {
    	super(b);
    }

    public B(int a, String b, char c) {
	super(a, b, c);
	System.out.println("B class constructor called");
    }

    public void accessParentField() {
	System.out.println("superclass's b public field " + b);
	System.out.println("superclass's c private package field " + c);
    }

    public static void main(String args[]) {
	B b = new B();
	// instance subclass can access non private superclass's fields
	System.out.println(b.b);
	b.accessParentField();
    }

}
