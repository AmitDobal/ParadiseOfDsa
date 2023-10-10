package datastructure.graphs;

import java.util.Arrays;

public class FillColor {
	public static void main(String[] args) {
		int[][] image = { { 0, 0, 0 }, { 0, 0, 0 } };
		int[][] image1 = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		for (int[] arr : image)
			System.out.println(Arrays.toString(arr));

//		floodFill(image, 1, 1, 2);
		floodFill(image, 0, 0, 0);
		System.out.println("AFTER:");
		for (int[] arr : image)
			System.out.println(Arrays.toString(arr));
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int currColor = image[sr][sc];
		int[][] isVisited = new int[image.length][image[0].length];
		return helper(image, sr, sc, color, currColor, isVisited);
	}

	private static int[][] helper(int[][] image, int sr, int sc, int color, int currColor, int[][] isVisited) {
		// base condition
		if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != currColor
				|| isVisited[sr][sc] == -1)
			return image;

		// mark the current cell with the color
		image[sr][sc] = color;
		isVisited[sr][sc] = -1;

		// mark all the adjacent similar color
		// left
		helper(image, sr, sc - 1, color, currColor, isVisited);
		// right
		helper(image, sr, sc + 1, color, currColor, isVisited);
		// up
		helper(image, sr - 1, sc, color, currColor, isVisited);
		// down
		helper(image, sr + 1, sc, color, currColor, isVisited);

		return image;
	}
}
