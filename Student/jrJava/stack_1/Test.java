package jrJava.stack_1;

public class Test {

	public static void main(String[] args) {
		
		Stack s = new Stack(10);
		
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');

		emptyStack(s);
	}

	
	public static void emptyStack(Stack s){
		while(!s.isEmpty()){
			System.out.print(s.pop() + " ");
		}
		System.out.println();
	}
	
}
 



