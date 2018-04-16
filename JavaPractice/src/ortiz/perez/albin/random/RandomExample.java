/**
 * 
 */
package ortiz.perez.albin.random;

import java.util.Random;

/**
 * @author Administrador
 *
 */
public class RandomExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Random random = new Random();// empty constructor
	System.out.println(random.nextInt());
	System.out.println(random.nextDouble());
	System.out.println(random.nextGaussian());

    }

}
