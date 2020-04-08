package com.jay.ds.stack;

public class GenericStack <T> {

	private int maxSize;
	private T[] data;
	private int top;
	
	@SuppressWarnings("unchecked")
	public GenericStack(int size) {
		this.maxSize = size;
		this.data = (T[]) new Object[this.maxSize];
		this.top = -1;
	}
	
	public void push(T l) {
		if(!isFull()) {
			data[++top] = l;	
		} else {
			System.err.println("Stack is full..");
		}
		
	}

	public T pop() {
		return data[top--];	
	}

	public T peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public void print() {
		while(!isEmpty()) {
			T value = pop();
			System.out.print(value);
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		GenericStack<Integer> jStack = new GenericStack(12);
		jStack.push(10);
		jStack.push(20);
		jStack.push(30);
		jStack.push(40);
		jStack.push(50);
		jStack.push(60);
		jStack.push(70);
		jStack.push(80);
		jStack.push(90);
		jStack.push(100);
		
		jStack.print();
		
		System.out.println();
		GenericStack<String> jStack1 = new GenericStack(6);
		jStack1.push("A");
		jStack1.push("G");
		jStack1.push("K");
		jStack1.push("D");
		jStack1.push("L");
		
		jStack1.print();
	}
}
