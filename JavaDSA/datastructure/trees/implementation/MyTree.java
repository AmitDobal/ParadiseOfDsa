package datastructure.trees.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
	TreeNode root;

	MyTree(int data) {
		root = new TreeNode(data);
	}

	// In order Traversal
	public void printInorder(TreeNode node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	// PreOrder Traversal
	public void printPreorder(TreeNode node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	// PostOrder Traversal
	public void printPostorder(TreeNode node) {
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data + " ");
	}

	// Height
	public int height(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;
	}

	// Print K distance
	public void printKDist(TreeNode root, int k) {
		if (null == root)
			return;

		if (k == 0)
			System.out.print(root.data + " ");
		else {
			printKDist(root.left, k - 1);
			printKDist(root.right, k - 1);
		}
	}

	// Level order traversal
	public void printLevelOrder() {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(this.root);

		while (!q.isEmpty()) {
			TreeNode curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
	}

	// Level order traversal Line by Line
	public void printLevelOrderByLine() {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(this.root);
		q.add(null);

		while (q.size() > 1) {
			TreeNode curr = q.poll();
			if (curr == null) {
				System.out.println();
				q.add(null);
				continue;
			}
			System.out.print(curr.data + " ");
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
	}

	// Level order traversal Line by Line
	public void printLevelOrderByLine2() {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				TreeNode curr = q.poll();
				System.out.print(curr.data + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}

	// Size
	public int size(TreeNode root) {
		if (root == null)
			return 0;
		return size(root.left) + size(root.right) + 1;
	}

	// Max value
	public int maxValue(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
	}

}
