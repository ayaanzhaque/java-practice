package jrJava.linkedList_3;

import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(35,  3.5);
		list.insert(15,  1.5);
		list.insert(17,  1.7);
		list.insert(88,  8.8);
		list.insert(25,  2.5);
		
		Iterator iter = new MyIterator(list);
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}
