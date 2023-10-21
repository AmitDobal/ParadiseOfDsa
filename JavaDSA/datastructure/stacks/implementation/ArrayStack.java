package datastructure.stacks.implementation;

public class ArrayStack {
	int[] table;
	int top;
	int size;
	
	public ArrayStack(int cap) {
		table = new int[cap];
		size = cap;
		top = -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		table[++top] = data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return table[top];
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return table[top--];
	}
	
	
	private boolean isFull() {
		return top == size - 1;
	}
	
	private boolean isEmpty() {
		return top == -1;
	}
}
