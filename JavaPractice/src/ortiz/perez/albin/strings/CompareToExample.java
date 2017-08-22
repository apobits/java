/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author aposo
 *
 */
public class CompareToExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String[] vocals = { "u", "o", "e", "i", "a" };

	for (int i = 0; i < vocals.length; i++) {
	    for (int j = i + 1; j < vocals.length; j++) {
		if (vocals[i].compareTo(vocals[j]) > 0) {// compareTo returns negative if the string invoking is greater than the string argument
		    // returns 0 if both strings are equal, greater than 0 if the string argument is greater than the invoking string
		    String k = vocals[j];
		    vocals[j] = vocals[i];
		    vocals[i] = k;
		}
	    }
	}

	for (int i = 0; i < vocals.length; i++)
	    System.out.println(vocals[i]);

    }

}
