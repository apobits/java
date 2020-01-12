/**
 *
 */
package practice.java.accessControl;

/**
 * @author apobits@gmail.com
 *
 */
public class Animal {

    //can be accessed anywhere
    public String name;
    //can be accessed from the same package or anywhere from a subclass
    protected boolean canFly;
    //can be accessed only from the same package
    int visionRange;
    //can be accessed only from the same class
    private String vision;

    /**
     * @param args
     */
    public static void main(String[] args) {

	Animal animal = new Animal();

	// Accessing public member
	animal.name = "Eagle";

	// Accessing private member
	animal.vision = "ultra";

	System.out.println("Name   " + animal.name);
	System.out.println("Vision " + animal.vision);

    }

    public void fly() {
	System.out.println("Can not fly");
    }

    protected void run() {
	System.out.println("Running");
    }

}
