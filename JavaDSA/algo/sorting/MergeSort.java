package algo.sorting;

public class MergeSort {

	public static int[] sort(int[] arr) {
		int n = arr.length;
		divide(arr, 0, n-1);
		return arr;
	}

	private static void divide(int[] arr, int l, int r) {

		if (l >= r)
			return;

		int mid = l + ((r - l) / 2);

		divide(arr, l, mid);
		divide(arr, mid + 1, r);
		conquer(arr, l, mid, r);

	}

	private static void conquer(int[] arr, int l, int mid, int r) {
		int[] merged = new int[r - l + 1];
		int p1 = l;
		int p2 = mid + 1;
		int idx = 0;

		while (p1 <= mid && p2 <= r) {
			if (arr[p1] 
					<= arr[p2])
				merged[idx++] = arr[p1++];
			else
				merged[idx++] = arr[p2++];
		}

		while (p1 <= mid) {
			merged[idx++] = arr[p1++];
		}
		while (p2 <= r) {
			merged[idx++] = arr[p2++];
		}

		for (int i = 0, j = l; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}
}
