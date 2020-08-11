package jrJava.queue_1;

public class Queue {

	private char[] values;
	private int front;
	
	
	public Queue(int size) {
		values = new char[size];
		front -=1;
	}
	
	public void enqueue(char value) {
		if(front==values.length-1) throw new IndexOutOfBoundsException();
		values[++front] = value;
	}
	
	public char dequeue() {
		if(front==-1) throw new IndexOutOfBoundsException();
		char temp = values[0];
		for(int i = 1; i<=front;i++) values[i-1] = values[i];
		front--;
		return temp;
	}
	
	public char peek() {
		if(front ==-1) throw new IndexOutOfBoundsException();
		return values[0];
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	//delete later, only for development
	public void printAll() {
		for(int i = 0; i <= front; i++) {
			System.out.println(values[i] + " ");
		}
	}
	
}
