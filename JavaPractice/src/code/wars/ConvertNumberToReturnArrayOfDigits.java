package code.wars;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertNumberToReturnArrayOfDigits {
    public static void main(String[] args) {
	System.out.println(Arrays.toString(digitize(13456)));
    }

    public static int[] digitize(long n) {
	return Stream.of(new StringBuilder().append(n).reverse().toString().split(""))
			.mapToInt(t -> Integer.parseInt(t)).toArray();
    }

}
