package com.hsbc.pattern;

import java.util.Scanner;

/*
GIVEN  N IN INPUT AND PRINT THE FOLLOWING PATTERN

7
*
**
***
****
*****
******
*******

*/

public class Pattern3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
