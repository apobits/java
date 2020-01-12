package practice.java.math;

public class MaximumCommonDivisor {

    public static void main(String[] args) {
	System.out.println(mcd(21, 6));

	System.out.println(mcdFromArray(new int[] { 1400, 1600, 1200, 1800 }));
    }

    /**
     * Gets the Maximum common divisor from two numbers
     *
     * @param a higher number
     * @param b lesser number
     * @return maximum common divisor
     */
    public static int mcd(int a, int b) {
	if (b == 0) {
	    return a;
	} else {
	    return mcd(b, a % b);
	}
    }

    public static int mcdFromArray(int[] numbers) {
	int mcd = numbers[0];

	for (int i = 1; i < numbers.length; i++) {
	    int higher = mcd > numbers[i] ? mcd : numbers[i];
	    int lower = mcd < numbers[i] ? mcd : numbers[i];
	    mcd = mcd(higher, lower);
	    if (mcd == 1) {
		return 1;
	    }
	}

	return mcd;
    }

}
