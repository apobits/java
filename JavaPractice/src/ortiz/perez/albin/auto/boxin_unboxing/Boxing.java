/**
 * 
 */
package ortiz.perez.albin.auto.boxin_unboxing;

/**
 * @author aposo
 *
 */
public class Boxing {

    /**
     * @param args
     */
    public static void main(String[] args) {

	int a = 10, b = 15;
	Integer x = a;// autboxing, Java implicitly creates the new Integer object with the value that a holds
	System.out.println("Primitive type " + a + " \nInteger type " + x);

	int y = x + b;// auto unboxing, Java implicitly obtains the int value from the Integer object
	System.out.println(y);

	System.out.println("Incrementing x object ");
	System.out.println(++x);
    }

}
