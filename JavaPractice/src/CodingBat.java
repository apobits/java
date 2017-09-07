/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class CodingBat {

<<<<<<< HEAD
    static int countXX(String str) {
	int count = 0;
	double temp = 0;
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == 'x')
		temp++;
	    else if (temp == 2) {
		count +=1;
		temp = 0;
	    }else if(temp>2){
		count +=temp-1;
	    }

	    if (i == str.length() - 1 && temp > 0)
		if (temp == 2) {
			count +=1;
			temp = 0;
		    }else if(temp>2){
			count +=temp-1;
		    }
	}

	return count;
    }

    public static void main(String[] args) {
	System.out.println(countXX("xxxxx"));

    }
=======
	static boolean countXX(String str) {
		int index = str.indexOf("x");

		return (str.length() - 1 != index) && (str.charAt(index + 1) == 'x') ? true : false;
	}

	public static void main(String[] args) {
		String x = "HixxElxxyxxxnxx";
		System.out.println(countXX(x));
	}
>>>>>>> 35801a0c045c04d3a2e49368cd24e928f1c2ed41

}
