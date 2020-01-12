package code.wars;

public class BitCounting {

    public static void main(String[] args) {
	System.out.println(convertToBinaryAndGetOnesCount(12));
    }

    private static int convertToBinaryAndGetOnesCount(int number) {
	int counter = 0;
	while (number > 0) {
	    if (number % 2 == 1) {
		counter++;
	    }
	    number = number / 2;
	}
	return counter;
    }

}
