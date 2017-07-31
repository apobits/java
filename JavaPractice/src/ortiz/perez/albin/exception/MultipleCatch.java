/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author aposo
 *
 */
public class MultipleCatch {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] x = { 1, 2, 3, 4, 5, 0, 7, 8, 9 };

	for (int i = 0; i < 11; i++) {
	    try {
		System.out.println(i / (x[i]));
		// }catch(Exception e){
		// System.out.println(e); //Application exception subclasses must be put first than their superclasses because of unreachable code
		// }
	    } catch (ArithmeticException e) {
		System.out.println(e);
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	    } catch (Exception e) {
		System.out.println(e);// Exception is superclass for ArithemticException and ArrayIndexOutOfBoundsException thus it must be put in the last catch block
	    }
	}

	for (int i = 0; i < 11; i++) {
	    try {
		System.out.println(i / (x[i]));
		// }catch(Exception e){
		// System.out.println(e); //Application exception subclasses must be put first than their superclasses because of unreachable code
		// }
	    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// Multi catch exception
		System.out.println(e);
	    } catch (Exception e) {
		System.out.println(e);// Exception is superclass for ArithemticException and ArrayIndexOutOfBoundsException thus it must be put in the last catch block
	    }
	}
    }
}
