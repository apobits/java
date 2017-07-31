/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class Finally {

    /**
     * @param args
     */
    public static void main(String[] args) {

	// try {
	// throw new RuntimeException();
	// } finally {
	// System.out.println("Printed after RuntimeException thrown");
	// }

	// try {
	// return;
	// } finally {
	// System.out.println("Printed after return in try clause");
	// }

	try {
	    System.out.println("Printed within try clause");
	} finally {
	    System.out.println("Printed after try clause");
	}

    }

}
