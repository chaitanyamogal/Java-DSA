package Array;

public class FindMaxMinElement {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 5, 6, 8, 9 };
		System.out.println(findMax(arr));
		System.out.println(findMin(arr));
	}

	static int findMax(int arr[]) {
		int max = arr[0];
		int i = 1;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}

	static int findMin(int arr[]) {
		int min = arr[0];
		int i = 1;

		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}
}