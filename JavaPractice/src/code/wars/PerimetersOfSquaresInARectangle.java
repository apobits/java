package code.wars;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PerimetersOfSquaresInARectangle {
    public static void main(String[] args) {
	System.out.println(perimeter(BigInteger.valueOf(7)));
    }

    public static BigInteger perimeter(BigInteger n) {
	BigInteger actual = BigInteger.ONE;
	BigInteger prev = BigInteger.ZERO;
	BigInteger sum = BigInteger.ZERO;

	for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
	    BigInteger temp = actual.add(BigInteger.ZERO);
	    sum = sum.add(actual);
	    actual = actual.add(prev);
	    prev = temp;
	}

	return sum.multiply(BigInteger.valueOf(4L));
    }

}
