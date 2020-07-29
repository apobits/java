package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalPoints {
    public static void main(String[] args) {
	assertEquals(30, points(new String[] { "1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3" }));
    }

    public static int points(String[] games) {
	int count = 0;
	for (String game : games) {
	    if (game.charAt(0) > game.charAt(2)) {
		count += 3;
	    } else if (game.charAt(0) == game.charAt(2)) {
		count += 1;
	    }
	}
	return count;
    }
}
