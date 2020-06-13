package com.ds.linkedlist;

public class DeleteAList {
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
	
	public void printlist() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public void deleteList() {
		head = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAList ll = new DeleteAList();
		ll.head = new Node(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.push(0);
		
		//ll.printlist();
		System.out.println("head : "+ll.head);
		ll.deleteList();
		//ll.printlist();
		System.out.println("head : "+ll.head);
				
	}

}
