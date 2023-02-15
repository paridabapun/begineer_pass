package twodarray;

import java.util.Scanner;

/*
 * 
 * Print matrix column by column
 * 
 * Problem Description
Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.


Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000


Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix Mat


Output Format
M lines denoting each column


Example Input
3 4
10 20 30 40
50 60 70 80
90 100 110 120


Example Output
10 50 90
20 60 100
30 70 110
40 80 120


Example Explanation
0th column -> 10 50 90
1st column -> 20 60 100
2nd column -> 30 70 80
3rd column -> 40 80 120
 */
public class Assignment2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int mat[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}

		for (int j = 0; j < M; j++) {
			for (int i = 0; i < N; i++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
