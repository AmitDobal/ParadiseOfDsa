package datastructure.linkedlist.problems;

import datastructure.linkedlist.implementation.MyLinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
//		list.add(9);
//		list.add(19);
		
		list.print();
		list.middleValue();
		list.printReverse();
	}
}
