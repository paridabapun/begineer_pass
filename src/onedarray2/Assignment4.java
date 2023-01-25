package onedarray2;

public class Assignment4 {
	public static int[] solve(int[] A, int B) {

		int arr[] = new int[2];
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == B) {
				
				arr[j] = i;
				++j;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int A[] = { -2, -2, 4, 4, 8, 9 };
		int B = 4;
		int arr2[] = solve(A, B);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}
