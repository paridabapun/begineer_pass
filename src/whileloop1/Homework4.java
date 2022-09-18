package whileloop1;


import java.util.Scanner;

/*
 * Q3. Multiplication Table
Problem Description

Write a program to print the multiplication table of the number entered by the user, N.

The table for input N = 5 should get displayed in the following form:

5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains an integer N.



Output Format

Output the Multiplication Table in the given form.



Example Input

Input 1:

 5
Input 2:

 2


Example Output

Output 1:

 5 * 1 = 5
 5 * 2 = 10
 5 * 3 = 15
 5 * 4 = 20
 5 * 5 = 25
 5 * 6 = 30
 5 * 7 = 35
 5 * 8 = 40
 5 * 9 = 45
 5 * 10 = 50
Output 2:

 2 * 1 = 2
 2 * 2 = 4
 2 * 3 = 6
 2 * 4 = 8
 2 * 5 = 10
 2 * 6 = 12
 2 * 7 = 14
 2 * 8 = 16
 2 * 9 = 18
 2 * 10 = 20


Example Explanation

 Print the Multiplication table as described.
 */
public class Homework4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int i = 1;
		while (i <= 10) {

			System.out.println(N + " * " + i + " = " + N * i);
			i++;
		}

	}

}
