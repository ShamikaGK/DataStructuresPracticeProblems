package com.ds.linkedlist;

public class GetnthNode {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = head;
		head = newnode;
	}
	
	public int iterativenthNode(int n) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (count == n)
				return temp.data;
			count++;
			temp = temp.next;
		}
		return 0;
	}
	
	public int recursiventhNode(Node temp, int n) {
		int count = 0;
		if(count == n)
			return temp.data;
		return recursiventhNode(temp.next, n-1);
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetnthNode ll = new GetnthNode();
		ll.head = new Node(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.printList();
		System.out.println("Getting 3rd node with iterative : "+ll.iterativenthNode(0));
		System.out.println("Getting 3rd node with recursive : "+ll.recursiventhNode(ll.head, 0));
	}

}
