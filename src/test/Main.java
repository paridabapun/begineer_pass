package test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {

			for (int j = 1; j < i - 1; j++) {
				System.out.print("S");
			}

			for (int k = 1; k <= N - i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}