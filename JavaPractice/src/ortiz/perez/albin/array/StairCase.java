/**
 * 
 */
package ortiz.perez.albin.array;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class StairCase {

	public static void main(String[] args) {
		System.out.println("How many stairs do you want to build ?");
		Scanner scan = new Scanner(System.in);
		int stairs = scan.nextInt();
		for (int i = 1; i <= stairs; i++) {
			for (int j = 0; j < stairs; j++) {
				if (j < stairs - i)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}

	}

}
