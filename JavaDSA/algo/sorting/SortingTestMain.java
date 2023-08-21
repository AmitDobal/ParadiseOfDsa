package algo.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTestMain {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 6, 5,2,2,2, 47, 50, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		// Before
		System.out.println("Before: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + "  "));
		
		//Using Stream to get sorted for comparing the answer
		System.out.println("\n Collection SOrt: ");
		list.stream().sorted().forEach(e -> System.out.print(e + " "));

		// Sorting Algorithms
//		BubbleSort.sort(arr);
//		SelectionSort.sort(arr, -1);
		InsertionSort.sort(arr);

		// After
		System.out.println("\nAfter: ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

	}
}
