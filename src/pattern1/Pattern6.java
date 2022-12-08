package pattern1;

import java.util.Scanner;

public class Pattern6 {
	/* 

*--------*
*--------*
*--------*
*--------*
*--------*
*--------*
*--------*
*--------*
*--------*


*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		
		for(int row = 1; row <= N; row++ ) {
			
			System.out.print("*");
			
			for(int col =1; col <= N-1; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println();
		}
		
		
	}
}
