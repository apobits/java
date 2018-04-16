/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
// Clonable interface must be implemented in order to use Object.clone method
public class CloneExampleNoOverriding implements Cloneable {

    int a = 0;
    String h = "Hello";
    public A aClass = new A();

    public static void main(String[] args) throws CloneNotSupportedException {

	CloneExampleNoOverriding c = new CloneExampleNoOverriding();
	CloneExampleNoOverriding cClone = (CloneExampleNoOverriding) c.clone();

	System.out.println(c.a);
	System.out.println(cClone.a);
	// c object and cClone object are different(they occupy different memory
	// locations)
	System.out.println(c.equals(cClone));
	// c object h attribute String class points to the same memory location as
	// cClone h attribute as it is a String literal
	System.out.println(c.h == cClone.h);
	// alters c object attribute
	c.aClass.setA(10);
	// prints cClone object attribute, c and cClone are pointing to the same
	// instance object
	System.out.println(cClone.aClass.getA());
    }

}
