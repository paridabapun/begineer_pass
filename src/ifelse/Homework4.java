package ifelse;

import java.util.Scanner;

/*
 * 
 *Q3. Min of two

Problem Description
Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.



Problem Constraints
1 <= A <= 1000000

1 <= B <= 1000000



Input Format
First line is a single integer A.
Second line is a single integer B.



Output Format
One line containing an integer as per the question.



Example Input
Input 1:

5 
6
Input 2:

1000 
10000


Example Output
Output 1:

5
Output 2:

1000


Example Explanation
Explanation 1:

Clearly, among 5 and 6, 5 is minimum.
Explanation 2:

Clearly, among 1000 and 10000, 1000 is minimum.

T = O(1)
S = O(1)

 * */
public class Homework4 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();

		if (A < B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}

	}
}
