package practice.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CountInversion {
	public static void main(String[] args) {

		int arr[] =
//					{ 1, 20, 6, 4, 5 };
//					{ 5, 4, 3, 2, 1 };
//				{ 3, 2, 1 };
//				{ 2, 5, 1, 3, 4 };
//		{52244275,123047899,493394237,922363607,378906890,188674257,222477309,902683641,860884025,339100162}; // 16
				{ 36343342, 658445766, 281323766, 703538013, 437455363, 900766801, 84401391, 159903601, 626186515,
						127519304, 222484765, 609828661, 190927389, 152625748, 358752776, 522920848, 494568773,
						977351598, 782415711, 966011559 };// 71

		int arr1[] = arr.clone();
		long result1 = inversionCountMergeSort(arr1);

		int arr2[] = arr.clone();
		long result2 = numberOfInversions(arr2, arr2.length);
		
		int arr3[] = arr.clone();
		long result3 = inversionCount(arr3);
		

		System.out.println(Arrays.toString(arr));
		System.out.println(result1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(result2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(result3);
		System.out.println(Arrays.toString(arr3));
	}

	public static long inversionCount(int[] arr) {
		// Your code goes here
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[j]< arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
		}
		return count;
	}

	public static long inversionCountMergeSort(int[] arr) {

		long count = mergeSortCount(arr, 0, arr.length - 1);

		return count;
	}

	public static long mergeSortCount(int[] arr, int low, int high) {
		if (low >= high)
			return 0;

		int mid = low + (high - low) / 2;

		long countLeft = mergeSortCount(arr, low, mid);
		long countRight = mergeSortCount(arr, mid + 1, high);

		long countCurrent = countConquer(arr, low, mid, high);

		long result = countLeft + countRight + countCurrent;
//		System.out.println(countLeft + " " + countRight + " " + countCurrent);
		return result;
	}

	private static long countConquer(int[] arr, int low, int mid, int high) {

		int p1 = low;
		int p2 = mid + 1;
		int p3 = 0;
		long count = 0;
		int[] mergedArray = new int[high - low + 1];

		while (p1 <= mid && p2 <= high) {
			if (arr[p1] <= arr[p2])
				mergedArray[p3++] = arr[p1++];
			else {
				mergedArray[p3++] = arr[p2++];
				count += (mid - p1 + 1);
			}
		}

		while (p1 <= mid) {
			mergedArray[p3++] = arr[p1++];
		}
		while (p2 <= high) {
			mergedArray[p3++] = arr[p2++];
		}

		int i = 0;
		int j = low;
		while (i < mergedArray.length) {
			arr[j++] = mergedArray[i++];
		}

		return count;
	}

	private static int merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array
		int left = low; // starting index of left half of arr
		int right = mid + 1; // starting index of right half of arr

		// Modification 1: cnt variable to count the pairs:
		int cnt = 0;

		// storing elements in the temporary array in a sorted manner//

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				cnt += (mid - left + 1); // Modification 2
				right++;
			}
		}

		// if elements on the left half are still left //

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		// if elements on the right half are still left //
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		// transfering all elements from temporary to arr //
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
		return cnt; // Modification 3
	}

	public static int mergeSort(int[] arr, int low, int high) {
		int cnt = 0;
		if (low >= high)
			return cnt;
		int mid = (low + high) / 2;
		cnt += mergeSort(arr, low, mid); // left half
		cnt += mergeSort(arr, mid + 1, high); // right half
		cnt += merge(arr, low, mid, high); // merging sorted halves
		return cnt;
	}

	public static int numberOfInversions(int[] a, int n) {
		// Count the number of pairs:
		return mergeSort(a, 0, n - 1);
	}
}
