package algo.sorting;
import java.util.Arrays;

public class MergeSortIterative {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 9, 3, 7, 2 };
		System.out.println("Initial Array: " + Arrays.toString(arr));
		iterativeMergeSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	public static void iterativeMergeSort(int[] arr) {
		int n = arr.length;
		int size;

		for (size = 1; size < n; size = 2 * size) {
			for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {
				int mid = Math.min(leftStart + size - 1, n - 1);
				int rightEnd = Math.min(leftStart + 2 * size - 1, n - 1);
				merge(arr, leftStart, mid, rightEnd);
			}
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		System.arraycopy(arr, left, leftArray, 0, n1);
		System.arraycopy(arr, mid + 1, rightArray, 0, n2);

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
			}
		}

		while (i < n1) {
			arr[k++] = leftArray[i++];
		}

		while (j < n2) {
			arr[k++] = rightArray[j++];
		}
	}

}
