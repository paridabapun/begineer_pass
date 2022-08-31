package com.hsbc.pattern;

import java.util.Scanner;

public class Pattern123 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for(int row =1; row <=n; row ++) {
			for(int col = 1; col <=n+1-row;col++) {
				System.out.print("*");
			}
			n--;
			System.out.println();
		}
	}

}
