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

	public void print() {
		Node temp = root;
		System.out.print("[");
		while (null != temp) {
			String delimitter = ",";
			if (null == temp.next)
				delimitter = "";
			System.out.print(temp.data + delimitter);
			temp = temp.next;
		}
		System.out.println("]");
	}

	public void middleValue() {
		Node slow = root;
		Node fast = root;

		while (null != root && null != fast && null != fast.next) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Middle Value is: " + slow.data);

	}
	public void insert(int data, int pos) {
		Node curr = root;
		if(curr == null) {
			
		}
	}

}
