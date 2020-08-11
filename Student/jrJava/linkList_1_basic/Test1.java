package jrJava.linkList_1_basic;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		System.out.println(list.size());
		
		list.insertAtBeginning(1,  1.1);
		list.insertAtBeginning(2,  2.2);
		list.insertAtBeginning(3,  3.3);
		list.insertAtBeginning(4,  4.4);
		list.insertAtBeginning(5,  5.5);
		
		System.out.println(list.size());
		
		list.printAll();
		
		list.insertAtEnd(6,  6.6);
		list.insertAtEnd(7,  7.7);
		list.insertAtEnd(8,  8.8);
		list.insertAtEnd(9,  9.9);
		
		list.printAll();
		
		//System.out.println(list.removeEnd());
		//list.printAll();
		
		while(!list.isEmpty()){
			System.out.println(list.removeEnd());
			list.printAll();
		}
		
		/*
		Link each;
		while(!list.isEmpty()){
			each = list.removeFirst();
			System.out.print("Removed: " + each + "      ");
			list.printAll();
		}
		*/
	}

}







