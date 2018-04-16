/**
 * 
 */
package ortiz.perez.albin.interfaces;

/**
 * @author apobits@gmail.com
 *
 */
// public access modifier defining Mobility interface as a global reference type
public interface Mobility {
    // ** property´s interfaces are constants **

    // by default they are public static final
    int WALK = 3;

    // explicitly defining public static final
    public static final int RUN = 10;

    // abstract methods are public by default
    void walk();

    // explicitly defining public access modifier
    public void run();

    // default implementation of method fly, it won't break previous implementations
    // that don't have this method
    // classes that implement this interface can override this method if fly is
    // supported
    default void fly() {
	System.out.println("I can't fly");
    }

    // static method is related to the interface, not the implementing class
    // static methods can't be overwritten
    static void stop() {
	System.out.println("I can´t move");
    }

}
