package pattern1;

import java.util.Scanner;

/*
 * 
 * Hollow pyramid pattern

8
********
*     *
*    *
*   *
*  *
* *
**
*

 */

public class Homework6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {

			System.out.print("*");

			for (int j = 1; j <= N - i - 1; j++) {
				if (i == 1) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			if (i != N) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}