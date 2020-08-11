package jrJava.abstractType_1;

public class MyArrayList {

	private String[] elements;
	private int lastElementIndex;


	public MyArrayList(){
		this(10);
	}

	public MyArrayList(int size){
		elements = new String[size];
		lastElementIndex = -1;
	}
	
	
	public int size(){  
		return lastElementIndex + 1;
	}
	
	
	public String get(int index){
		if(index<0 || index>lastElementIndex) {
			throw new IndexOutOfBoundsException();
		}
		return elements[index];
	}
	
	
	public void add(String ref){
		add(lastElementIndex+1, ref);
	}
	
	
	public void add(int index, String ref){
		if(index<0 || index>lastElementIndex+1) throw new IndexOutOfBoundsException();
		
		if(lastElementIndex==elements.length-1){
			String[] elements2 = new String[elements.length*2];
			for(int i=0; i<elements.length; i++) {
				elements2[i] = elements[i];
			}
			elements = elements2;
		}
		
		for(int i=lastElementIndex; i>=index; i--) elements[i+1] = elements[i];
		
		elements[index] = ref;
		lastElementIndex++;
	}
	
	
	public String remove(int index){
		
		if(index < 0 || index > lastElementIndex) throw new IndexOutOfBoundsException();
		
		if(elements.length>=10 && size()<elements.length/2) {
			String[] elements2 = new String[elements.length*3/4];
			for(int i = 0; i <= lastElementIndex; i++) elements[i] = elements[i];
			elements = elements2;
		}
		
		String toReturn = elements[index];
			
		for(int i= index; i < lastElementIndex; i++) elements[i] = elements[i+1];
		elements[lastElementIndex] = null;
		lastElementIndex--;	
		return toReturn;
	}
	
	
	public boolean remove(String ref){
		
		for(int i = 0; i <= lastElementIndex; i++) {
			if(elements[i]==ref) {
				remove(i);
				return true;
			}
		}
		return false;
		
	}
	
	
	// DELETE THIS AFTER DONE THE DEVELOPMENT
	public void printAll(){
		for(int i=0; i<elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
		System.out.println();
	}
	
}















