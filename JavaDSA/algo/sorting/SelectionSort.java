package algo.sorting;

public class SelectionSort {
	public static int[] sort(int[] arr) {
		return sort(arr, 1);
	}

	public static int[] sort(int[] arr, int n) {

		boolean isAsc = n == 1 ? true : false;

		for (int i = 0; i < arr.length; i++) {
			int minSoFarIdx = i;

			for (int j = i + 1; j < arr.length; j++) {
				if ((isAsc && arr[j] < arr[minSoFarIdx]) || (!isAsc && arr[j] > arr[minSoFarIdx]))
					minSoFarIdx = j;
			}
			if (minSoFarIdx != i) {
				int temp = arr[minSoFarIdx];
				arr[minSoFarIdx] = arr[i];
				arr[i] = temp;
			}
		}

		return arr;
	}

}
