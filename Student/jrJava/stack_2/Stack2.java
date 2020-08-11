package jrJava.stack_2;

import java.util.ArrayList;
import java.util.EmptyStackException;

import jrJava.abstractType_3_generics.MyArrayList;

// This is kind of inefficient stack operation.
// It uses the head of array as 'top', not as 'bottom'
// like the other Stack in this package.

public class Stack2<E> {

	private ArrayList<E> list;
	
	public Stack2(){
		list = new ArrayList<E>();
	}
	
	public void push(E ref){
		list.add(0, ref);
	}
	
	public E pop(){
		if(isEmpty()) throw new EmptyStackException();
		return list.remove(0);
	}
	
	public E peek(){
		if(isEmpty()) throw new EmptyStackException();
		return list.get(0);
	}
	
	public boolean isEmpty(){
		return list.size()==0;
	}
	

}



