/**
 * 
 */
package ortiz.perez.albin.interfaces;

/**
 * @author apobits@gmail.com
 *
 */
public class Person implements Mobility {

    @Override
    public void walk() {
	System.out.println("Walking at " + WALK);

    }

    @Override
    public void run() {
	System.out.println("Running at " + RUN);

    }
    
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        Mobility.super.fly();
    }

    public static void main(String[] args) {
	Mobility p = new Person();
	// calling implemented interface walk method
	p.walk();
	// calling implemented interface run method
	p.run();
	// calling interface default method
	p.fly();
	// calling static interface method
	Mobility.stop();

    }

}
