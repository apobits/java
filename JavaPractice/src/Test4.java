import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class Test4 {

    static int[] oddNumbers(int l, int r) {
	List<Integer> numbers = new ArrayList<>();
	for (int i = l; i <= r; i++) {
	    if ((i % 2) == 1) {
		numbers.add(i);
	    }
	}
	int[] oddNumbers = new int[numbers.size()];
	int count = 0;
	for (int x : numbers) {
	    oddNumbers[count++] = x;
	}
	return oddNumbers;

    }

    public static void main(String[] args) throws IOException {

    }

}
