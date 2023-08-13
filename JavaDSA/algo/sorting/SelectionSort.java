package algo.sorting;

public class SelectionSort {
	public static int[] sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int minSoFar = arr[i];
			int minSoFarIdx = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < minSoFar) {
					minSoFar = arr[j];
					minSoFarIdx = j;
				}
			}
			if(minSoFarIdx !=  i ) {
				arr[minSoFarIdx] = arr[i];
				arr[i] = minSoFar;
			}
		}
		
		return arr;
	}

}
