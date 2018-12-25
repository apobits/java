/**
 * 
 */
package practice.java.accessControl.otherPackage;

import practice.java.accessControl.Animal;

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
		// Accessing public member from a different class in a different package
		animal.name = "Eagle";

		// Cannot access private member from a different class in a different package
		// animal.vision ="Ultra";
		
		//Cannot access protected member from a different class in a different package
		//animal.canFly;

		System.out.println(animal.name);
	}

}
