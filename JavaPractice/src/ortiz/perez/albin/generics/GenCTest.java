/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class GenCTest extends B {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// GenC<T> c = new GenC<String>("");// Bound mismatch: The type String is not a valid substitute for the bounded parameter
	// <T extends B & Comparable<String>> of the type GenC<T>
	GenC<GenCTest> c = new GenC<GenCTest>(new GenCTest());
	
    }

}
