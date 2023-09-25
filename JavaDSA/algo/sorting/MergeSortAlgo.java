package algo.sorting;

import java.util.Arrays;

public class MergeSortAlgo {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 9, 3, 7, 2 };
		sort(arr);
	}

	public static void sort(int[] arr) {
		System.out.println("Before: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();

		mergeSort(arr, 0, arr.length - 1);
		
		System.out.println("After: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		System.out.println();

	}

	private static void mergeSort(int[] arr, int l, int r) {
		if (l >= r)
			return;

		int mid = l + (r - l) / 2;

		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);

		merge(arr, l, mid, r);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] mergedArray = new int[r - l + 1];

		int p1 = l;
		int p2 = mid + 1;
		int p3 = 0;

		while (p1 <= mid && p2 <= r) {
			if (arr[p1] <= arr[p2]) {
				mergedArray[p3++] = arr[p1++];
			} else {
				mergedArray[p3++] = arr[p2++];
			}
		}

		while (p1 <= mid) {
			mergedArray[p3++] = arr[p1++];
		}
		while (p2 <= r) {
			mergedArray[p3++] = arr[p2++];
		}

		for (int i = 0, j = l; i < mergedArray.length; i++, j++) {
			arr[j] = mergedArray[i];
		}

	}
}
