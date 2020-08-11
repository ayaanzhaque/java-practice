package jrJava.linkedList_innerClass_1;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
	
		java.util.LinkedList<String> list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		
		System.out.println(list.remove());
		System.out.println("\n");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String each = iter.next();
		}

		

	}

}
