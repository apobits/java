/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class CodingBat {

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

}
