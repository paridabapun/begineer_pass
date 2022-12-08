package test;

public class Main {

	public static String solve(String A) {

		String sum = "";

		for (int i = 0; i < A.length(); i++) {
			sum = sum + A.charAt(i);
			int index = (A.charAt(i) - 'a') + 1;
			sum = sum + index;

		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(solve("hello"));
	}
}
