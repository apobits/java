/**
 * 
 */

/**
 * @author aposo
 *
 */
public class Test {

    public int close10(int a, int b) {

	int x = Math.abs(10 - a);

	int y = Math.abs(10 - b);

	int z = 0;

	if (x > y)
	    z = b;
	else if (x < y)
	    z = a;

	return z;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	System.out.println(new Test().close10(13, 7));

    }

}
