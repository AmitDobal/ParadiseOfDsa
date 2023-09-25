package algo.sorting;

import java.util.Arrays;

public class QuickSortALgo {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 9, 3, 7, 2 };
		System.out.println("Initial Array: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	public static void quickSort(int arr[], int low, int high) {
		if (low >= high)
			return;

		int pivotIdx = partition(arr, low, high);

		quickSort(arr, low, pivotIdx - 1);
		quickSort(arr, pivotIdx + 1, high);

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int minPtr = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				minPtr++;
				// swap
				int temp = arr[minPtr];
				arr[minPtr] = arr[j];
				arr[j] = temp;
			}
		}
		minPtr++;
		int temp = arr[minPtr];
		arr[minPtr] = pivot;
		arr[high] = temp;

		return minPtr;
	}
}
