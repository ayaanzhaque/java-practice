package jrJava.stack_2;

import java.util.EmptyStackException;

public class Stack<E> {

	private E[] array;
	private int top;
	
	public Stack(int size){
		array = (E[]) new Object[size];
		top = -1;
	}
	
	public void push(E ref){
		if(top==array.length-1) throw new IndexOutOfBoundsException();
		array[++top] = ref;
	}
	
	public E pop(){
		if(top==-1) throw new EmptyStackException();
		return array[top--];
	}
	
	public E peek(){
		if(top==-1) throw new EmptyStackException();
		return array[top];
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
}
