package jrJava.linkedList_4;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(35,  3.5);
		list.insert(15,  1.5);
		list.insert(17,  1.7);
		list.insert(88,  8.8);
		list.insert(25,  2.5);
		
		MyIterator iter = new MyIterator(list);
		
		Link each;
		while(iter.hasNext()){
			each = iter.next();
			System.out.println(each);
			if(each.id==15 || each.id==25) iter.remove();
		}
		
		System.out.println(); 
		
		iter.reset();
		while(iter.hasNext()){
			each = iter.next();
			System.out.println(each);
		}
	}

}





