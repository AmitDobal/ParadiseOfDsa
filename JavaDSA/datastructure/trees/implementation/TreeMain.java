package datastructure.trees.implementation;

public class TreeMain {
	public static void main(String[] args) {
		MyTree tree = new MyTree(10);
		
		tree.root.left = new TreeNode(20);
		tree.root.right = new TreeNode(30, new TreeNode(40), new TreeNode(50));
		
		System.out.println("Inorder: ");
		tree.printInorder(tree.root);
		System.out.println();
		
		System.out.println("PreOrder: ");
		tree.printPreorder(tree.root);
		System.out.println();
		
		System.out.println("PostOrder: ");
		tree.printPostorder(tree.root);
		System.out.println();
		
	}
}
