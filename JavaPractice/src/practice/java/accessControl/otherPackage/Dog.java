/**
 *
 */
package practice.java.accessControl.otherPackage;

import practice.java.accessControl.Animal;

/**
 * @author aposo
 *
 */
public class Dog extends Animal {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog dog = new Dog();
	Animal animal = new Animal();

	// Accessing public member from a subclass in a different package
	System.out.println(dog.name);

	// Accessing private member from a subclass in a different package is not
	// possible
	// System.out.println(dog.vision);

	// Accessing package private member from a subclass in a different package is
	// not possible
	// System.out.println(dog.visionRange);

	// Accessing protected member from a subclass in a different package
	System.out.println(dog.canFly);

	// Accessing protected member from a subclass in a different package
	dog.run();

	//cannot access protected fields in a different package
	//animal.canFly;

    }

    @Override
    protected void run() {
	// TODO Auto-generated method stub
	super.run();
    }

}
