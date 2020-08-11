package jrJava.linkedList_innerClass_2;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		Employee[] employees = Utility.loadEmployeeArrayFromFile("File");


		LinkedList<String> list = new LinkedList<String>();


		for(int i = 0; i < employees.length; i++) {
			list.insert(employees[i]);
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String each = iter.next();
			System.out.println(each);
		}

	} 

}
