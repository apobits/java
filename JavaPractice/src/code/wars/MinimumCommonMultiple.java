package code.wars;

import practice.java.math.MaximumCommonDivisor;

public class MinimumCommonMultiple {
    public static void main(String[] args) {
	System.out.println(leastCommonMultiple(4, 6));
    }

    public static int leastCommonMultiple(int a, int b) {
	int higher = a > b ? a : b;
	int lower = a > b ? b : a;

	int mcd = MaximumCommonDivisor.mcd(higher, lower);

	return higher / mcd * lower;

    }

}
