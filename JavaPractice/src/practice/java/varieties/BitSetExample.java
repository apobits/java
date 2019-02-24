/**
 * 
 */
package practice.java.varieties;

import java.util.BitSet;

/**
 * @author apobits@gmail.com
 *
 */
public class BitSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// works with bits as boolean values
		// Empty constructor
		BitSet bitSet = new BitSet();

		// Constructor with initial size
		BitSet bitSet2 = new BitSet(10);

		// sets true at the specified index
		bitSet.set(0);

		// sets true at the specified index
		bitSet2.set(0);

		// get method returns true or false value from the specified index
		System.out.println(bitSet.get(0));

		// logical and
		bitSet.and(bitSet2);

		// sets false to the specified index
		bitSet.set(1, false);

		// sets true at the specified index
		bitSet.set(2, true);

		// shows all the indexes that have 1(true) value
		System.out.println(bitSet);

	}

}
