package com.ds.linkedlist;

import java.util.Stack;

public class ReverseNodesInKGrp {
	
	//	 * Definition for singly-linked list.
	  static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0, len = 0, times = 0;
        ListNode prev = null, next = null, temp = head, last = null, headNode = head, prevlast = null;
        while(temp != null) {
        	len++;
        	temp = temp.next;
        }
        times = len/k;
        temp = head;
        for(int i=0; i<times; i++) {
        	count = 0;
        	last = temp;
	        while(count < k) {
	        	count++;
	        	next = temp.next;
	        	temp.next = prev;
	        	prev = temp;
	        	if(count == k && i == 0) {
	        		headNode = temp;
	        		prevlast = last;
	        	}
	        	if(count == k) {
	        		head = temp;
	        		prevlast.next = head;
	        		last.next = next;
	        		prevlast = last;
	        	}
	        	temp = next;
	        }
        }
        return headNode;
    }
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNodesInKGrp obj = new ReverseNodesInKGrp();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode output = obj.reverseKGroup(head, 2);
		while(output != null) {
			System.out.println(output.val);
			output = output.next;
		}
	}
	
	

}
