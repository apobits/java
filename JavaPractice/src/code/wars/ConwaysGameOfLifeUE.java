package code.wars;

import java.util.Arrays;

public class ConwaysGameOfLifeUE {
    public static void main(String[] args) {
	//	var result = getGeneration(new int[][] { { 1, 0, 0 }, { 0, 1, 1 }, { 1, 1, 0 } }, 40);
	int[][] result = getGeneration(new int[][] { { 1, 1, 1, 0, 0, 0, 1, 0 }, { 1, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 1, 0, 0, 0, 1, 1, 1 } }, 5);
	for (int i = 0; i < result.length; i++) {
	    System.out.println(Arrays.toString(result[i]));
	}
    }

    public static int[][] getGeneration(int[][] cells, int generations) {
	int[][] newCells = copy(cells);
	for (int k = 0; k < generations; k++) {
	    newCells = grow(newCells);
	    int[][] matrixCopy = copy(newCells);
	    for (int i = 0; i < matrixCopy.length; i++) {
		for (int j = 0; j < matrixCopy[i].length; j++) {
		    int liveNeighbours = 0;
		    //upper left corner
		    try {
			if (matrixCopy[i - 1][j - 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //upper right corner
		    try {
			if (matrixCopy[i - 1][j + 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //lower left corner
		    try {
			if (matrixCopy[i + 1][j - 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //lower right corner
		    try {
			if (matrixCopy[i + 1][j + 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //down
		    try {
			if (matrixCopy[i + 1][j] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //left
		    try {
			if (matrixCopy[i][j - 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //right
		    try {
			if (matrixCopy[i][j + 1] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    //up
		    try {
			if (matrixCopy[i - 1][j] == 1) {
			    liveNeighbours++;
			}
		    } catch (ArrayIndexOutOfBoundsException e) {
		    }

		    if (newCells[i][j] == 1) {
			if (liveNeighbours < 2 || liveNeighbours > 3) {
			    newCells[i][j] = 0;
			}
		    } else if (liveNeighbours == 3) {
			newCells[i][j] = 1;
		    }
		}
	    }
	}
	return crop(newCells);
    }

    private static int[][] copy(int[][] matrix) {
	int[][] copy = new int[matrix.length][];
	for (int i = 0; i < matrix.length; i++) {
	    copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
	}
	return copy;
    }

    private static int[][] grow(int[][] matrix) {
	int [][] grown = new int[matrix.length + 2][];
	int i = 0;
	grown[0] = new int[matrix[0].length + 2];
	for (; i < matrix.length; i++) {
	    grown[i + 1] = new int[matrix[i].length + 2];
	    for (int j = 0; j < matrix[i].length; j++) {
		grown[i + 1][j + 1] = matrix[i][j];
	    }
	}
	grown[i + 1] = new int[matrix[i - 1].length + 2];
	return grown;
    }

    private static int[][] crop(int[][] matrix) {
	int startX = -1;
	int endX = matrix.length;

	//find x start
	for (int i = 0; i < matrix.length; i++) {
	    boolean alive = false;
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] == 1) {
		    alive = true;
		}
	    }
	    if (alive) {
		startX = i - 1;
		break;
	    }
	}

	//find x end
	for (int i = matrix.length - 1; i > 0; i--) {
	    boolean alive = false;
	    for (int j = 0; j < matrix[i].length; j++) {
		if (matrix[i][j] == 1) {
		    alive = true;
		}
	    }
	    if (alive) {
		endX = i + 1;
		break;
	    }
	}
	int startY = -1;
	int endY = matrix.length;
	//find y start
	for (int i = 0; i < matrix[0].length; i++) {
	    boolean alive = false;
	    for (int j = 0; j < matrix.length; j++) {
		if (matrix[j][i] == 1) {
		    alive = true;
		}
	    }
	    if (alive) {
		startY = i - 1;
		break;
	    }
	}

	//find y end
	for (int i = matrix[0].length - 1; i > 0; i--) {
	    boolean alive = false;
	    for (int j = 0; j < matrix.length; j++) {
		if (matrix[j][i] == 1) {
		    alive = true;
		}
	    }
	    if (alive) {
		endY = i + 1;
		break;
	    }
	}

	int[][] result = new int[endX - (startX + 1)][];
	for (int i = 0; i < result.length; i++) {
	    int sizeY = (endY - startY) - 1;
	    result[i] = new int[sizeY];
	    startX++;
	    int itY = startY + 1;
	    for (int j = 0; j < sizeY; j++) {
		result[i][j] = matrix[startX][itY++];
	    }
	}

	return result;
    }

}
