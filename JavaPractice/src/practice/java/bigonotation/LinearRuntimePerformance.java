/**
 *
 */
package practice.java.bigonotation;

/**
 * @author aposo
 *
 */
public class LinearRuntimePerformance {

    //operations 1: assigning i = 0
    //operations 3: getting i, update i, set i
    //operations 1: accessing array at
    //operations 2: reading array length and comparing to i
    //operations 1: m(number of characters being compared by the equals method)
    //Total operations 7+m
    //Big O notation is O(nm)
    public static int findPosition(String nameToFind, String[] names) {
	for (int i = 0; i < names.length; i++) {

	    if (names[i].equals(nameToFind)) {
		return i;
	    }
	}
	return -1;
    }

    public static void main(String[] args) {

	String[] names = new String[] { "Hello", "There", "Are", "You", "Busy" };

	System.out.println(findPosition("You", names));

    }

}
