package jrJava.stack_1;

import java.util.EmptyStackException;

public class Stack {

	private char[] array;
	private int top;
	
	public Stack(int size){
		array = new char[size];
		top = -1;
	}
	
	public void push(char ch){
		if(top==array.length-1) throw new IndexOutOfBoundsException();
		array[++top] = ch;
	}
	
	public char pop(){
		if(top==-1) throw new EmptyStackException();
		return array[top--];
	}
	
	public char peek(){
		if(top==-1) throw new EmptyStackException();
		return array[top];
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
}




