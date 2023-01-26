package pattern3;

import java.util.Scanner;

/*
 * 
 *Q2. Stair Pattern

 *
 *
 *6
*
**
***
****
*****
******

Problem Description

Take an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****

Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the stair pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 *
 **
Output 2:

 *
 **
 ***


Example Explanation

 Print the pattern as described.

 */

public class Assignment2 {
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