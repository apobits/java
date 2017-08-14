/**
 * 
 */
package ortiz.perez.albin.lambda_expressions;

/**
 * @author aposo
 *
 */
public class LambdaExpException {

    static class EmptyException extends Exception {
	public EmptyException() {
	    super("Empty array");
	}
    }

    static interface Calc {
	double average(double[] info) throws EmptyException;
    }

    /**
     * @param args
     * @throws EmptyException
     */
    public static void main(String[] args) throws EmptyException {
	Calc c = t -> {
	    if (t.length == 0)
		throw new EmptyException();
	    int sum = 0;
	    for (int i = t.length - 1; i >= 0; i--) {
		sum += t[i];
	    }
	    return sum / t.length;
	};

	System.out.println(c.average(new double[] { 1.0, 2.0, 3.0 }));
	c.average(new double[0]);

    }

}
