/**
 * 
 */
package practice.java.typepromotion;

/**
 * @author apobits@gmail.com
 *
 */
public class TypePromotion {

	public static void main(String[] args) {
		
		byte a = 50;
		a =(byte)((byte) 50*23);
		
		System.out.println(a);

		byte b = 50;
		a=(byte) (b*2);

	}

}
