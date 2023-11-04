package datastructure.trees.implementation;

public class TreeMain {
	public static void main(String[] args) {
		MyTree tree = new MyTree(10);

		tree.root.left = new TreeNode(20);
		tree.root.right = new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(70)),
				new TreeNode(50, new TreeNode(80)));

		System.out.println("Inorder: ");
		tree.printInorder(tree.root);
		System.out.println();

		System.out.println("PreOrder: ");
		tree.printPreorder(tree.root);
		System.out.println();

		System.out.println("PostOrder: ");
		tree.printPostorder(tree.root);
		System.out.println();

		System.out.println("Height of the Tree: " + tree.height(tree.root));

		System.out.println("Print k distance: ");
		tree.printKDist(tree.root, 3);
		System.out.println();

		System.out.println("Level Order traversal: ");
		tree.printLevelOrder();
		System.out.println();
		
		System.out.println("Level Order traversal Line By Line: ");
		tree.printLevelOrderByLine2();
		System.out.println();
		
		System.out.print("Size of the tree: " + tree.size(tree.root));
		System.out.println();
		
		System.out.print("Max Value of the tree: " + tree.maxValue(tree.root));
		System.out.println();
	}
}
