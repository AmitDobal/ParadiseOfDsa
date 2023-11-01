package datastructure.trees.implementation;

public class MyTree {
	TreeNode root;
	
	MyTree(int data){
		root = new TreeNode(data);
	}
	
	//Inorder Traversal
	public void printInorder(TreeNode node) {
		if(node == null) return ;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	//PreOrder Traversal
	public void printPreorder(TreeNode node) {
		if(node == null) return ;
		System.out.print(node.data + " ");
		printInorder(node.left);
		printInorder(node.right);
	}
	//PostOrder Traversal
	public void printPostorder(TreeNode node) {
		if(node == null) return ;
		printInorder(node.left);
		printInorder(node.right);
		System.out.print(node.data + " ");
	}

}
