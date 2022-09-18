package whileloop2;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int perfectSq = 2;
		while (perfectSq < N) {

			perfectSq *= perfectSq;
			System.out.print(perfectSq + " ");
			perfectSq++;
		}
	}
}
