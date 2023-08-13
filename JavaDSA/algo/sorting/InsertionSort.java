package algo.sorting;

public class InsertionSort {
	public static int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int j = i - 1;
			while (j >= 0 && curr < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = curr;
		}

		return arr;
	}

}
