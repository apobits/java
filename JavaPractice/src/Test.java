/**
 * 
 */

/**
 * @author aposo
 *
 */
public class Test {

<<<<<<< HEAD
	public boolean stringE(String str) {
		int count = 0;
		char x[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (x[i] == 'e')
				count++;
			if (count > 3)
				return false;
		}
=======
    public String stringTimes(String str, int n) {
	StringBuilder stringBuilder = new StringBuilder(str);
	if (n == 0)
	    return "";
	for (int i = 0; i < n - 1; i++)
	    stringBuilder.append(str);
	return stringBuilder.toString();
>>>>>>> branch 'master' of https://github.com/apobits/java.git

<<<<<<< HEAD
		return count == 0 ? false : true;
=======
    }
>>>>>>> branch 'master' of https://github.com/apobits/java.git

<<<<<<< HEAD
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Test().stringE("Heelele"));
	}
=======
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
>>>>>>> branch 'master' of https://github.com/apobits/java.git

}
