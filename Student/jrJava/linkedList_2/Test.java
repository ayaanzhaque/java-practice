package jrJava.linkedList_2;

public class Test {

	public static void main(String[] args) {
		
		int[] aaa = {35, 15, 17, 88, 25};
		/*
		for(int i=0; i<aaa.length; i++){
			System.out.println(aaa[i]);
		}

		int i, j;
		for(i=0; i<aaa.length; i++){
			for(j=i; j<aaa.length; j++){
				System.out.println(aaa[i] + ", " + aaa[j]); 
			}
		}
		*/
		
		LinkedList list = new LinkedList();
		list.insert(35,  3.5);
		list.insert(15,  1.5);
		list.insert(17,  1.7);
		list.insert(88,  8.8);
		list.insert(25,  2.5);
		
		/*
		for(i=0; i<list.size(); i++){
			System.out.println(list.get(i)); 
		}
		
		for(i=0; i<list.size(); i++){
			for(j=i; j<list.size(); j++){
				System.out.println(list.get(i) + ",  " + list.get(j)); 
			}
		}
		*/
		
		/*
		Link each;
		while(list.hasNext()){
			each = list.next();
			System.out.println(each);
		}
	    */
		
		/*
		Link link1, link2;
		while(list.hasNext()){
			link1 = list.next();
			list.reset();
			while(list.hasNext()){
				link2 = list.next();
				System.out.println(link1 + ", " + link2); 
			}
		}
		*/
		
		Client2 client2 = new Client2();
		client2.list = list;
		Thread t2 = new Thread(client2);
		t2.start();
		
		Link each;
		list.reset();
		while(list.hasNext()){
			each = list.next();
			System.out.println("t1: " + each);
		}
		
		 
	}

}





