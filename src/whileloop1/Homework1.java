package whileloop1;

import java.util.Scanner;
/*
 * Q1. Sum of Odds - easy


Problem Description

You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].



Problem Constraints

1 <= A <= 1000



Input Format

First and only line contains a single positive integer A.



Output Format

Print the required sum in a single line.


Example Input

Input 1:

 1 
Input 2:

 4 


Example Output

Output 1:

 1 
Output 2:

 4 


Example Explanation

Explanation 1:

 For A = 1, 1 is the only odd number which lies in the range [1, 1].
Explanation 2:

 For A = 4, Odd numbers 1 and 3 lie in the range [1, 4]. 
 Sum = 1 + 3 = 4. 
 */
public class Homework1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 1;

		while (i <= N) {
			sum += i;
			i += 2;

		}
		
		System.out.println(sum);

	}
}
