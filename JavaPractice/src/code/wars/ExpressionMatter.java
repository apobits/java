package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionMatter {

    public static void main(String[] args) {
	assertEquals(9, expressionsMatter(1, 1, 1));
    }

    public static int expressionsMatter(int a, int b, int c) {
	if (a == 1 && c == 1) {
	    return a + b + c;
	}
	if (a == 1) {
	    return (a + b) * c;
	}
	if (b == 1) {
	    return a > c ? a * (b + c) : (a + b) * c;
	}
	if (c == 1) {
	    return a * (b + c);
	}
	return a * b * c;
    }

}
