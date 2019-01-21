/**
 * 
 */
package practice.java.accessControl;

/**
 * @author apobits@gmail.com
 *
 */
public class Animal {

	public String name;

	private String vision;

	protected boolean canFly;

	int visionRange;

	public void fly() {
		System.out.println("Can not fly");
	}

	protected void run() {
		System.out.println("Running");
	}

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

}
