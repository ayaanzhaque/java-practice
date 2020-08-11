package jrJava.queue_2;

public class Queue<E> {

	private E[] values;
	private int front;
	
	
	public Queue(int size) {
		values = (E[]) new Object[size];
		front -=1;
	}
	
	public void enqueue(E value) {
		if(front == values.length-1) throw new IndexOutOfBoundsException();
		values[++front] = value;
	}
	
	public E dequeue() {
		if(front == -1) throw new IndexOutOfBoundsException();
		E temp = values[0];
		for(int i = 1; i <= front; i++) values[i-1] = values[i];
		front--;
		return temp;
	}
	
	public E peek() {
		if(front == -1) throw new IndexOutOfBoundsException();
		return values[0];
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public void printAll() {
		for(int i = 0; i <= front; i++) System.out.println(values[i] + " ");
		System.out.println();
	}
	
}
	
	