package com.ds.stack;

public class StackUsingArray {
	int top;
	static int max = 100;
	int a[] = new int[max];
	
	StackUsingArray(){
		top = -1;
	}
	
	boolean isEmpty() {
		return (top < 0 );
	}
	
	boolean push(int element) {
		if (top >= max-1) {
			System.out.println("Stack overflow");
			return false;
		} else {
			a[++top] = element;
			System.out.println("Element "+element+" pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			return a[top--];
		}
	}
	
	int peek() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			return a[top];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray ss = new StackUsingArray();
		System.out.println("top value = "+ ss.top);
		ss.push(10);
		ss.push(20);
		ss.push(30);
		System.out.println("ss pop = "+ss.pop());
		System.out.println("ss peek = "+ss.peek());
		System.out.println("ss empty = "+ss.isEmpty());
		System.out.println("ss pop = "+ss.pop());
		System.out.println("ss peek = "+ss.peek());
		System.out.println("top value = "+ ss.top);
		System.out.println("ss pop = "+ss.pop());
		System.out.println("ss peek = "+ss.peek());
		System.out.println("ss empty = "+ss.isEmpty());
	}

}
