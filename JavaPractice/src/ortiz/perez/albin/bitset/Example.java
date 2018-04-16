/**
 * 
 */
package ortiz.perez.albin.bitset;

import java.util.BitSet;

/**
 * @author Administrador
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitSet bs = new BitSet();
		bs.set(1);
		bs.set(2);
		System.out.println(bs.get(2));
	}

}
