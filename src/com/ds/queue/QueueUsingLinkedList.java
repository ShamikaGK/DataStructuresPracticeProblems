package com.ds.queue;

public class QueueUsingLinkedList {
	
	static class QNode{
		int data;
		QNode next;
		QNode(int d){
			data = d;
			next = null;
		}
	}
	
	QNode front, rear;
	
	public QueueUsingLinkedList() {
		this.front = this.rear = null;
	}

	void enQueue(int item) {
		QNode temp = new QNode(item);
		if (this.rear == null)
			this.front = this.rear = temp;
		this.rear.next = temp;
		this.rear = temp;
	}
	
	QNode deQueue() {
		if (this.front == null)
			return null;
		QNode temp = this.front;
		this.front = this.front.next;
		if (this.front == null)
			this.rear = null;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		System.out.println("Front = "+q.front.data);
		System.out.println("Rear = "+q.rear.data);
		System.out.println("Dequeued : "+q.deQueue().data+" from queue");
		System.out.println("Front = "+q.front.data);
		System.out.println("Rear = "+q.rear.data);
	}

}
