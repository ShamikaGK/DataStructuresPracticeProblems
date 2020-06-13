package com.ds.queue;

public class QueueUsingArray {
	int front, rear, size, capacity;
	int[] array;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = this.capacity - 1;
		this.array = new int[this.capacity];
	}
	
	boolean isFull(QueueUsingArray queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty(QueueUsingArray queue) {
		return (queue.size == 0);
	}
	
	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear+1)%this.capacity;
		this.array[this.rear] = item;
		this.size++;
		System.out.println("Item "+item+" enqueued in queue");
	}
	
	int dequeue() {
		if (isEmpty(this)) 
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front+1)%this.capacity;
		this.size--;
		System.out.println("Item "+item+" dequeued from the queue");
		return item;
	}
	
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.front];
	}
	
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q = new QueueUsingArray(10);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("Front = "+q.front());
		System.out.println("Rear = "+q.rear());
		System.out.println("Dequeue = "+q.dequeue());
		System.out.println("Front = "+q.front());
		System.out.println("Rear = "+q.rear());
	}

}
