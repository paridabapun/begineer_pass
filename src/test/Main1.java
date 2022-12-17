package test;

import java.util.Scanner;

class Main1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = N;

		int mat[][] = new int[N][M];
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < M; j++) {
}
		}

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < M; j++) {
					System.out.print(mat[i][j] + " ");
				}
			} else {
				for (int j = M - 1; j >= 0; j--) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}

	}

}