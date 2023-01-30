package Array;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String args[]) {
		int arr[] = {4, 5, 1, 2};
		reverseArray(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

}
