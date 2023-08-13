package algo.sorting;

public class BubbleSort {

	public static int[] sort(int[] arr) {

		return sort(arr, 1);
	}

	public static int[] sort(int[] arr, int n) {
		boolean isAsc = n == 1 ? true : false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if ((isAsc && arr[j] > arr[j + 1]) || (!isAsc && arr[j] < arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
