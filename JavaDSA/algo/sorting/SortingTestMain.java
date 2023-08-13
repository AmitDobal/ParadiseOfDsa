package algo.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingTestMain {
	public static void main(String[] args) {

		int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		System.out.println("Before: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		BubbleSort.sort(arr);
		System.out.println("\nAfter: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

	}
}
