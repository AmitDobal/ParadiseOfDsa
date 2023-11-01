package datastructure.trees.implementation;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	TreeNode(int data){
		this(data,null,null);
	}
	TreeNode(int data, TreeNode left){
		this(data, left, null);
	}
}
