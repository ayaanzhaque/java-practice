package jrJava.abstractType_1;

public class Test1 {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(6);

		//list.printAll();
		//System.out.println(list.size()); 
		//list.get(0);
		
		list.add("aaa"); 
		list.add("bbb"); 
		list.add("ccc"); 
		list.add(0, "fff"); 
		list.add(1, "ggg"); 
		list.add(1, null); 
		list.add("xxx");
		list.add("yyy");
		list.add(0, "zzz");
		
		list.printAll();
		
		System.out.println(list.size());
		System.out.println(list.get(2)); 
	}

}





