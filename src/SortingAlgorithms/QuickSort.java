package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String args[]) {
		int arr[] = { 2, 6, 7, 3, 1, 9, 0 };
		quickSort(arr, 0, 6);
		System.out.print(Arrays.toString(arr));
	}

	static int partition(int array[], int low, int high) {

		int pivot = array[high];

		// pointer for greater element
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {

				i++;
				// swapping element at i with element at j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		// swap the pivot element with the greater element specified by i
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return (i + 1);
	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {

			int pi = partition(array, low, high);

			quickSort(array, low, pi - 1);

			quickSort(array, pi + 1, high);
		}
	}

}
