/**
 * 
 */
package ortiz.perez.albin.collection.enumset;

import java.util.EnumSet;

/**
 * @author Administrador
 *
 */
public class EnumSetExample {

	enum Vowels {
		A, E, I, O, U
	}

	public static void main(String[] args) {
		EnumSet<Vowels> es = EnumSet.of(Vowels.A);
		System.out.println(es);
		es = EnumSet.of(Vowels.A);
		System.out.println(es);
	}

}
