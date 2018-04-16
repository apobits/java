/**
 * 
 */
package ortiz.perez.albin.interfaces;

/**
 * @author apobits@gmail.com
 *
 */

// when implementing a parent interface and a child interface, the latter has
// preference over its parent
public class Person1 implements Mobility, Mobility1 {

    @Override
    public void walk() {
	// TODO Auto-generated method stub

    }

    @Override
    public void run() {
	// TODO Auto-generated method stub

    }

    public static void main(String[] args) {

	Person1 p = new Person1();
	// if Mobility1(Child) overrides default fly method then that method
	// implementation is called, otherwise Mobility(Parent)
	// fly default method is called
	p.fly();

    }

}
