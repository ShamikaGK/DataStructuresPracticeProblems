package com.ds.linkedlist;

public class LengthofList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}
	
	public int iterativeCount() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public int recursiveCount(Node n) {
		if (n == null) {
			return 0;
		}
		return 1 + recursiveCount(n.next);
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthofList ll = new LengthofList();
		ll.head = new Node(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		
		ll.printList();
		System.out.println("Length using iterative = "+ll.iterativeCount());
		System.out.println("Length using recursive = "+ll.recursiveCount(ll.head));
	}

}
