package onedarray2;

public class Homework2 {
	/*
	 * Q2. First Multiple



Problem Description:

Write a program for a given integer x and a list ls to return the first multiple of x that occurs in the list, and if there isn’t any multiple of x in the list then return -1.

Input Format:

The first input to the function is a list ls and the second input is the integer x.
Output Format:

Return the multiple of x from the list in integer format, else return -1.
Sample Input:

1
4
2 1 2 4 3 5
Sample Output:

4
Sample explanation:

In the list, the first element that is a multiple of 4 is 4.


	 */

	public static int first_multiple(int[] ls, int x) {

		for (int i = 0; i < ls.length; i++) {
			if (ls[i] % x == 0) {
				return ls[i];
			}
		}
		return -1;

	}

	public static void main(String[] args) {

	}

}
