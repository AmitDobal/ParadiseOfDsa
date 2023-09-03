package practice.problems;

import java.util.Arrays;

public class NiceStrings {
	public static void main(String[] args) {
		String[] A = { "z","k","a"};//, "d", "p", "s", "o", "n", "r", "c", "a", "b", "r", "a" };
		Arrays.stream(A).forEach(e -> System.out.print(e + " "));
		System.out.println();
		String[] A2 = Arrays.copyOf(A, A.length);
		int[] res = niceStrings(A);
		int[] res2 = niceStrings2(A2);

		Arrays.stream(res).forEach(e -> System.out.print(e + " "));
		System.out.println();
		Arrays.stream(res2).forEach(e -> System.out.print(e + " "));

		System.out.println();
		System.out.println(Arrays.equals(res, res2));
		int a = 0;
		System.out.println(a|0);
	}

	public static int[] niceStrings(String[] A) {
		int n = A.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (A[j].charAt(0) < A[i].charAt(0))
					count++;
			}
			res[i] = count;
		}
		return res;
	}

	public static int[] niceStrings2(String[] A) {
		int n = A.length;
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			String curr = A[i];
			int j = i - 1;
			for (j = i - 1; j >= 0; j--) {
				if (A[j].compareTo(curr) >= 0) {
					A[j + 1] = A[j];
				} else {
					break;
				}
			}
			A[j + 1] = curr;
			ans[i] = j + 1;
//			Arrays.stream(A).forEach(e -> System.out.print(e + " "));
//			System.out.println();
		}
		return ans;
	}
}
