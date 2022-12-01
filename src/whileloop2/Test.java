package whileloop2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output

		int[] arr = { 10, 20, 30, 40, 50 };

		arr[3] = 95;

		arr[4] = 60;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}

}