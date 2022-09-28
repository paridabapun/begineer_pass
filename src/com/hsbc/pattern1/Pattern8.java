package com.hsbc.pattern1;

import java.util.Scanner;

/*
  6
-----*
----**
---***
--****
-*****
******
*/

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int row = 1; row <= N; row++) {

			for (int col = 1; col <= N - row; col++) {
				System.out.print("-");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
