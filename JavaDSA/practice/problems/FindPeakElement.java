package practice.problems;

import java.util.Arrays;

public class FindPeakElement {
	public static void main(String[] args) {
		int[] nums = {1,2,1,3,5,6,4};
		int peakElement = findPeakElement(nums);
		
		Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
		System.out.println("\nIndex: " + peakElement + "\nValue: " + nums[peakElement]);
		
		
	}

	public static int findPeakElement(int[] nums) {
		int n = nums.length;
		int l = 0;
		int r = n - 1;

		while (l <= r) {
			int mid = l + ((r - l) / 2);

			if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
				l = mid + 1;
			} else if (mid > 0 && nums[mid] < nums[mid - 1]) {
				r = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
