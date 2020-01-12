/**
 *
 */
package practice.java.accessControl;

/**
 * @author apobits@gmail.com
 *
 */
public class AnimalConsumer {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Animal animal = new Animal();

	// Accessing public member from a different class
	animal.name = "Eagle";

	// Cannot access private member outside the owner class
	// animal.vision="Ultra";

	System.out.println(animal.canFly);

	System.out.println(animal.name);

	System.out.println(animal.visionRange);

    }

}
