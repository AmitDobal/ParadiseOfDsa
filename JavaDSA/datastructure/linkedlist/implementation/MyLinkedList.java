package datastructure.linkedlist.implementation;

public class MyLinkedList {
	Node root;

	public MyLinkedList() {
		root = null;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			while (null != current.next) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

}
