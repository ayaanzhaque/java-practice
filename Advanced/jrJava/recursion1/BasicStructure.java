package jrJava.recursion1;

public class BasicStructure {
	
	public static int level;

	public static void main(String[] args) {

		m();
		
	}
	
	public static void m(){
		level++;
		
		System.out.println(level);
		
		if(level>=100){
			return;
		}
		
		m();
		
		
	}

}
