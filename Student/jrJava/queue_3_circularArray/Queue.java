package jrJava.queue_3_circularArray;

public class Queue<E> {

	private E[] values;
	private int front, rear, size;
	
	public Queue(int n) {
		values = (E[]) new Object();
		front = -1;
		rear = 0;
		size = 0;
	}
	
	public void enqueue(E value) {
		if(size==values.length) throw new IndexOutOfBoundsException();
		front ++;
		if(front==values.length) front = 0;
		values[front] = value;
		size++;
	}
	
	public E dequeue() {
		
		E temp = values[rear];
		values[rear] = null;
		rear++;
		if(rear==values.length) rear = 0;
		size--;
		return temp;
	}
	
	public E peek() {
		return null;
	}
	
	public boolean isEmpty() {
		
	}
	
	public void printAll() {
		for(int i = 0; i < values.length; i++) System.out.println(values[i] + " ");
	}
	
	
}
