package com.ds.linkedlist;

public class InsertAndDeleteInList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAt(Node n, int idata) {
		if (n == null) {
			System.out.println("The previous node is null this should not be the case.");
			return;
		}
		Node new_node = new Node(idata);
		new_node.next = n.next;
		n.next = new_node;
	}
	
	public void insertEnd(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		
		last.next = new_node;
	}
	
	public void deleteNode(int ddata) {
	//	System.out.println("delete Node head = "+head.data);
		Node temp = head, prev = null;
//		if (temp != null && temp.data == ddata) {
//			head = temp.next;
//			return;
//		}
		while (temp != null && temp.data != ddata) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp == null) return;
		
		prev.next = temp.next;
	}
	
	public void printlist() {
	//	System.out.println("print Node head = "+head.data);
		Node last = head;
		while(last != null) {
			System.out.println(last.data + " ");
			last = last.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAndDeleteInList ll = new InsertAndDeleteInList();
		ll.insertEnd(3);
		ll.push(1);
		ll.insertAt(ll.head.next, 2);
		ll.insertAt(ll.head.next.next, 2);
		ll.insertEnd(4);
		ll.printlist();
		ll.deleteNode(2);
		ll.printlist();
	}

}
