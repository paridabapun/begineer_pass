package twodarray;

/*
 * Q3. Sum of Columns of 2D Array

 Problem Description
Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.


Problem Constraints
1 <= A,B <= 103
1 <= C[i][j] <= 103


Input Format
The first argument is a single integer A.
The second argument is a single integer B.
The third argument is a 2D integer array C.


Output Format
Return an integer array of size B that represents the sums of the columns of the 2D array C.


Example Input
Input 1:
A = 3
B = 2
C = [[4, 1], [1, 3], [6, 2]]
Input 2:

A = 2
B = 2
C = [[1, 1], [4, 1]]


Example Output
Output 1:
[11, 6]
Output 2:

[5, 2]


Example Explanation
Explanation 1:
 Column 1 : 4 + 1 + 6 = 11
Column 2 : 1 + 3 + 2 = 6
Explanation 2:

Column 1 : 4 + 1 = 5
Column 2 : 1 + 1 = 2
 
 
 */
public class Homework3 {
	public int[] solve(int A, int B, int[][] C) {

		int res[] = new int[B];

		for (int i = 0; i < B; i++) {

			for (int j = 0; j < A; j++) {

				res[i] += C[j][i];
			}

		}

		return res;

	}

	public static void main(String[] args) {

	}
}
