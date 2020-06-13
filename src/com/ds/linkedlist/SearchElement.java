package com.ds.linkedlist;

public class SearchElement {
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null; 
		}
	}
	
	public void push (int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public boolean iterativeSearch(int key) {
		Node n = head;
		while(n != null) {
			if (n.data == key)
				return true;
			n = n.next;
		}
		return false;
	}
	
	public boolean recursiveSearch(Node n, int key) {
		if (n == null)
			return false;
		if (n.data == key)
			return true;
		return recursiveSearch(n.next, key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElement ll = new SearchElement();
		ll.head = new Node(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.printList();
		System.out.println("Searched using iterative = "+ll.iterativeSearch(3));
		System.out.println("Searched using iterative = "+ll.iterativeSearch(6));
		System.out.println("Searched using recursive = "+ll.recursiveSearch(ll.head, 3));
		System.out.println("Searched using recursive = "+ll.recursiveSearch(ll.head, 6));
	}

}
