/**
 * 
 */
package jam.code;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class AlphabetCake {

	public static void main(String args[]) {
		try {
			Scanner scanner = new Scanner(new FileReader("C:\\Users\\Administrador\\Desktop\\A-small-practice.in"));
			int cases = scanner.nextInt();
			for (int it = 1; it <= cases; it++) {
				int r = scanner.nextInt();
				int c = scanner.nextInt();
				System.out.println("Case #" + it + ":");
				char cake[][] = new char[r][c];
				for (int i = 0; i < r; i++) {
					String temp = scanner.next();
					for (int j = 0; j < c; j++) {
						cake[i][j] = temp.charAt(j);
					}
				}

				// get child initial
				List<Character> letters = new ArrayList<>();
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++) {
						if (cake[i][j] != '?') {
							letters.add(cake[i][j]);
						}
					}
				}

				// update cake cells
				for (int x = 0; x < r; x++) {
					int count = 0;
					for (int y = 0; y < c; y++) {
						if (cake[x][y] == '?' ) {
							count++;
						} else if (count > 0) {
							for (int z = count; z > 0; z--) {
								if (cake[x][y] != '?') {
									cake[x][y - z] = cake[x][y];
								} else if (y + z < c) {
									cake[x][y - z] = cake[x][y + 1 + z];
								} else {
									cake[x][y - z] = letters.get(0);
								}

							}
							count = 0;
						}
						// if (cake[x][y] == '?' && x > 0 && y > 0 && x + 1 != r
						// && y + 1 != c) {
						//
						// all surrounded squares are equal
						// CCC
						// C?C
						// CCC

						// if (temp == cake[x - 1][y - 1] && temp == cake[x +
						// 1][y - 1] && temp == cake[x - 1][y]
						// && temp == cake[x + 1][y] && temp == cake[x][y + 1]
						// && temp == cake[x - 1][y + 1]
						// && temp == cake[x + 1][y + 1]) {
						// cake[x][y] = temp;
						// }
						//
						// if (temp == cake[x - 1][y - 1] && temp == cake[x +
						// 1][y - 1] && temp == cake[x - 1][y]
						// && temp == cake[x + 1][y] && temp == cake[x][y + 1]
						// && temp == cake[x - 1][y + 1]
						// && temp == cake[x + 1][y + 1]) {
						// cake[x][y] = temp;
						// }

						// }
					}
				}

				// print
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++) {
						System.out.print(cake[i][j]);
					}
					System.out.println();
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}