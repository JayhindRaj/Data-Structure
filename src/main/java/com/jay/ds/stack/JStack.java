package com.jay.ds.stack;

/**
 * Stack implementation using Array
 * 
 * @author jayrajpo
 *
 */
public class JStack {

	private int maxSize;
	private long[] data;
	private int top;

	public JStack(int size) {
		this.maxSize = size;
		data = new long[this.maxSize];
		this.top = -1;
	}

	public void push(long l) {
		if(!isFull()) {
			data[++top] = l;	
		} else {
			System.err.println("Stack is full..");
		}
		
	}

	public long pop() {
		if(!isEmpty()) {
			return data[top--];	
		} 
		else {
			System.err.println("Stack is Empty..");
			return 0;
		}
		
	}

	public long peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		JStack jStack = new JStack(12);
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
		
		while(!jStack.isEmpty()) {
			long value = jStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
	}
}
