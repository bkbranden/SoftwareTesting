package assignment3;

import java.util.EmptyStackException;

public class Stack<T> {
	
	
	public Stack() {
		
	}
	
	private StackNode<T> top;

	public StackNode<T> peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top;
	}
	
	public StackNode<T> pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		StackNode<T> item = top;
		top = top.next;
		return item;
	}
	
	public void push(StackNode<T> node) {
		node.next = top;
		top = node;
	}
	
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		else {
			return false;
		}
	}
}


