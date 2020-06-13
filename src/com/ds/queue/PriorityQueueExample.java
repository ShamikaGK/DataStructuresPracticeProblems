package com.ds.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(10);
		pq.add(9);
		pq.add(20);
		System.out.println("pq peek: "+pq.peek());
		System.out.println("pq poll: "+pq.poll());
		System.out.println("pq peek: "+pq.peek());
		System.out.println("comparator: "+pq.comparator());
	}

}
