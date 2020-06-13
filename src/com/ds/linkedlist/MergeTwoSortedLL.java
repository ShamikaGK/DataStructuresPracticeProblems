package com.ds.linkedlist;

public class MergeTwoSortedLL {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void addToLast(int newdata) {
		Node newnode = new Node(newdata);
		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public Node mergeList(Node head1, Node head2) {
		Node dummy = new Node(0);
		Node tail = dummy;
		while(true) {
			if( head1 == null) {
				tail.next = head2;
				break;
			} else if (head2 == null) {
				tail.next = head1;
				break;
			}
			
			if (head1.data <= head2.data) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;	
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLL list1 = new MergeTwoSortedLL();
		MergeTwoSortedLL list2 = new MergeTwoSortedLL();
		list1.addToLast(2);
		list1.addToLast(4);
		list1.addToLast(6);
		list1.addToLast(8);
		list2.addToLast(1);
		list2.addToLast(2);
		list2.addToLast(3);
		list2.addToLast(5);
		list2.addToLast(7);
		System.out.println("Heads : List1: "+list1.head.data+" List2: "+list2.head.data);
		list1.head = list1.mergeList(list1.head, list2.head);
		list1.printList();
	}

}
