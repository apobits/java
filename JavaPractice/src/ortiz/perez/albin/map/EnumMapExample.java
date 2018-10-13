/**
 * 
 */
package ortiz.perez.albin.map;

import java.util.EnumMap;

/**
 * @author Administrador
 *
 */
public class EnumMapExample {
	// keys are restricted for enum type
	public static void main(String[] args) {
		
		EnumMap<Vowels, Integer> eMap = new EnumMap<>(Vowels.class);
		eMap.put(Vowels.A, 1);
		// eMap.put("E", 2);//it only accepts Vowels type info
		System.out.println(eMap);
	}

	static enum Vowels {
		A, E, I, O, U
	}

}
