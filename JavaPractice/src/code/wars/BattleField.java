package code.wars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleField {
    private static final String COMMA = ",";
    private static HashMap<String, Integer> shipsMap = new HashMap<>();
    private static HashSet<String> processedCoordinates = new HashSet<>();
    private static int[][] battleField = { { 1, 0, 0, 0, 0, 1, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 0, 0, 0, 1, 0 },
		    { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
		    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
		    { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

    public static void main(String[] args) {
	assertEquals(true, fieldValidator(battleField));
    }

    public static boolean fieldValidator(int[][] field) {
	boolean result = false;
	for (int y = 0; y < field.length; y++) {
	    for (int x = 0; x < field[y].length; x++) {
		if (!processedCoordinates.contains(y + COMMA + x) && field[y][x] != 0 && !detectShip(field, x, y)) {
		    reset();
		    return false;
		}
	    }
	}

	if (shipsMap.getOrDefault("BattleShip", -1) == 1 && shipsMap.getOrDefault("Cruiser", -1) == 2
			&& shipsMap.getOrDefault("Destroyer", -1) == 3 && shipsMap.getOrDefault("Submarine", -1) == 4) {
	    result = true;
	}
	reset();
	return result;
    }

    private static void reset() {
	shipsMap.clear();
	processedCoordinates.clear();
    }

    private static boolean detectShip(int[][] field, int x, int y) {
	boolean down = y < field.length - 1 && field[y + 1][x] == 1;
	boolean right = x < field[y].length - 1 && field[y][x + 1] == 1;
	if (down && right) {
	    return false;
	}
	int size = 0;
	boolean isStart = true;
	if (right) {
	    while (x < field[y].length && field[y][x] == 1) {
		if (isValidPart(field, x, y, isStart, 1)) {
		    size++;
		    isStart = false;
		    x++;
		} else {
		    return false;
		}
	    }
	} else if (down) {
	    while (y < field.length && field[y][x] == 1) {
		if (isValidPart(field, x, y, isStart, 2)) {
		    size++;
		    isStart = false;
		    y++;
		} else {
		    return false;
		}
	    }
	} else {
	    if (isValidPart(field, x, y, isStart, 3)) {
		size++;
	    } else {
		return false;
	    }
	}
	shipsMap.merge(shipType(size), 1, (t, u) -> t + u);
	return true;
    }

    private static boolean isValidPart(int[][] field, int x, int y, boolean isStart, int direction) {
	if (direction == 1) {
	    if (isStart && x > 0 && !checkLeft(field, x, y)) {
		return false;
	    }
	    if (!checkUp(field, x, y) || !checkDown(field, x, y) || !checkLowerLeftCorner(field, x, y)
			    || !checkLowerRightCorner(field, x, y) || !checkUpperLeftCorner(field, x, y)
			    || !checkUpperRightCorner(field, x, y)) {
		return false;
	    }

	} else if (direction == 2) {
	    if (isStart && !checkUp(field, x, y)) {
		return false;
	    }

	    if (!checkLeft(field, x, y) || !checkRight(field, x, y) || !checkLowerLeftCorner(field, x, y)
			    || !checkLowerRightCorner(field, x, y) || !checkUpperLeftCorner(field, x, y)
			    || !checkUpperRightCorner(field, x, y)) {
		return false;
	    }
	} else {
	    if (!checkLeft(field, x, y) || !checkRight(field, x, y) || !checkUp(field, x, y) || !checkDown(field, x, y)
			    || !checkLowerLeftCorner(field, x, y) || !checkLowerRightCorner(field, x, y)
			    || !checkUpperLeftCorner(field, x, y) || !checkUpperRightCorner(field, x, y)) {
		return false;
	    }
	}

	processedCoordinates.add(y + COMMA + x);
	return true;
    }

    private static boolean checkLeft(int[][] field, int x, int y) {
	if (x > 0 && field[y][x - 1] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkUp(int[][] field, int x, int y) {
	if (y > 0 && field[y - 1][x] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkDown(int[][] field, int x, int y) {
	if (y < field.length - 1 && field[y + 1][x] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkRight(int[][] field, int x, int y) {
	if (x < field[y].length - 1 && field[y][x + 1] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkUpperLeftCorner(int[][] field, int x, int y) {
	if (y > 0 && x > 0 && field[y - 1][x - 1] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkLowerLeftCorner(int[][] field, int x, int y) {
	if (y < field.length - 1 && x > 0 && field[y + 1][x - 1] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkUpperRightCorner(int[][] field, int x, int y) {
	if (y > 0 && x < field[y].length - 1 && field[y - 1][x + 1] == 1) {
	    return false;
	}
	return true;
    }

    private static boolean checkLowerRightCorner(int[][] field, int x, int y) {
	if (y < field.length - 1 && x < field[y].length - 1 && field[y + 1][x + 1] == 1) {
	    return false;
	}
	return true;
    }

    private static String shipType(int size) {
	switch (size) {
	case 1:
	    return "Submarine";
	case 2:
	    return "Destroyer";
	case 3:
	    return "Cruiser";
	case 4:
	    return "BattleShip";
	default:
	    return "";
	}
    }

    private static void printMatrix(int[][] data) {
	for (int y = 0; y < data.length; y++) {
	    System.out.println(Arrays.deepToString(Arrays.stream(data[y]).mapToObj(t -> t).toArray()));
	}
    }

}
