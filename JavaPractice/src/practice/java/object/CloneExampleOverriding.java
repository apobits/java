/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
// Clonable interface must be implemented in order to use Object.clone method
public class CloneExampleOverriding implements Cloneable {

    int a = 0;
    String h = "Hello";
    public A aClass = new A();

    @Override
    protected Object clone() throws CloneNotSupportedException {
	CloneExampleOverriding temp = (CloneExampleOverriding) super.clone();
	temp.aClass = (A) aClass.clone();
	return temp;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

	CloneExampleOverriding c = new CloneExampleOverriding();
	CloneExampleOverriding cClone = (CloneExampleOverriding) c.clone();

	// alters c object attribute
	c.aClass.setA(10);

	// prints cClone object attribute, c and cClone are pointing to the same
	// instance object
	System.out.println(cClone.aClass.getA());
    }

}
