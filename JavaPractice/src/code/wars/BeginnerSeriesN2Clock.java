package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeginnerSeriesN2Clock {
    public static void main(String[] args) {
	assertEquals(61000, Past(1, 1, 1));
    }

    public static int Past(int h, int m, int s) {
	return (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000);
    }
}
