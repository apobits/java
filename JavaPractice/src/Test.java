/**
 * 
 */

/**
 * @author aposo
 *
 */
public class Test {

    public String stringTimes(String str, int n) {
	StringBuilder stringBuilder = new StringBuilder(str);
	if (n == 0)
	    return "";
	for (int i = 0; i < n - 1; i++)
	    stringBuilder.append(str);
	return stringBuilder.toString();

    }

    public String frontTimes(String str, int n) {
	String temp = str.length() >= 3 ? str.substring(0, 3) : str;
	StringBuilder stringBuilder = new StringBuilder(temp);
	if (n == 0)
	    return "";
	for (int i = 0; i < n - 1; i++)
	    stringBuilder.append(temp);
	return stringBuilder.toString();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(new Test().frontTimes("Hihihihi", 2));
    }

}
