package jrJava.linkedList_3;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(35,  3.5);
		list.insert(15,  1.5);
		list.insert(17,  1.7);
		list.insert(88,  8.8);
		list.insert(25,  2.5);
		
		/*
		MyIterator iter = new MyIterator();
		iter.list = list;
		
		iter.reset();
		Link each;
		while(iter.hasNext()){
			each = iter.next();
			System.out.println(each);
		} 
		*/
		
		/*
		MyIterator iter1 = new MyIterator();
		iter1.list = list;
		MyIterator iter2 = new MyIterator();
		iter2.list = list;
		
		Link each1, each2;
		iter1.reset();
		while(iter1.hasNext()){
			each1 = iter1.next();
			iter2.reset();
			while(iter2.hasNext()){
				each2 = iter2.next();
				System.out.println(each1 + ", " + each2); 
			}
		}
		*/
		
		
		Client2 c2 = new Client2();
		c2.list = list;
		Thread t2 = new Thread(c2);
		t2.start();
		

		Iterator iter = new MyIterator(list);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}





