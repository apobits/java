/**
 *
 */
package practice.java.accessControl.otherPackage;

/**
 * @author apobits@gmail.com
 *
 */
public class DogConsumer {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog dog = new Dog();
	//System.out.println(dog.visionRange); visionRange cannot be accessed outside its package

    }

}
