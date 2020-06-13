package com.ds.linkedlist;

import com.ds.linkedlist.GetnthNodeFromLast.Node;

public class GetnthNodeFromLast {

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
	
	public void firstWay(int n) {
		int len = 0;
		Node temp = head;
		while(temp != null) {
			len++;
			temp = temp.next;
		}
		temp = head;
		for(int i=1; i<len-n+1; i++) {
			temp = temp.next;
		}
		System.out.println("Node n = "+n+" and node data using first way = "+temp.data);
	}
	
	public void secondWay(int n) {
		Node mainNode = head;
		Node refNode = head;
		int count = 0;
		if (head != null) {
			while (count<n) {
				refNode = refNode.next;
				count++;
			}
			while (refNode != null) {
				mainNode = mainNode.next;
				refNode = refNode.next;
			}
			System.out.println("Node n = "+n+" and node data is = "+mainNode.data);
		}
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
		GetnthNodeFromLast ll = new GetnthNodeFromLast();
		ll.head = new Node(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.printList();
		ll.firstWay(2);
		ll.secondWay(2);
	}

}
