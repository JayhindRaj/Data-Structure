package com.jay.ds.stack;

public  class Stack <T> {
	private Node<T> top;
	private Node<T> head;
	private int size;

	public Stack () {
		this.head = new Node(0);
		this.size = 0;
		this.top = head;
	}

	public void push(T t) {
		Node<T> cur = new Node(t);
		cur.setNext(top);
		this.top = cur;
		size++;
		return;
	}

	public Node<T> peek() {
		return top;
	}

	public T pop() {

		if (size == 0 || top.getNext() == null) {
//			throw  java.util.NoSuchElementException();
			System.err.println("Stack is empty");
		}

		T value = peek().getData();
		this.top = this.top.getNext();
		size--;
		return value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void print() {
		StringBuilder sb = new StringBuilder();
		Node<T> cur = head.getNext();
		sb.append(cur.getData() + "->");
		while (!cur.equals(top)) {
			sb.append(cur.getData() + "->");
		}
		sb.append("null");
		System.out.println(sb.toString());
	}

	public void clear() {
		head.setNext(null);
		top = head;
		size = 0;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack();
		System.out.println(st.size());
		// st.pop(); //NoSuchElementException
		st.push(1);
		st.push(10);
		st.push(100);
		st.push(150);
		st.push(180);
		st.push(70);
		
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		st.clear();
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		// st.pop(); //NoSuchElementException
	}
}
