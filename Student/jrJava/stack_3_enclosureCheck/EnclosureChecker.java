package jrJava.stack_3_enclosureCheck;

public class EnclosureChecker {

	private String expression;
	
	public EnclosureChecker(String expression){
		this.expression = expression;
	}
	
	public void check(){
		boolean error = false;
		Stack<Character> stack = new Stack<Character>(200);
		
		char ch, popped;
		for(int i=0; i<expression.length(); i++){
			ch = expression.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
			else if(ch==')' || ch=='}' || ch==']'){
				if(!stack.isEmpty()) {
					popped = stack.pop();
					if(ch==')' && popped!='(' ||  
					   ch=='}' && popped!='{' ||  
					   ch==']' && popped!='[' ) {
						
						System.out.println("Mismatch at " + i + " with " + ch + ".");
						error = true;
						break;
					}	
				}
				else {
					System.out.println("More closing symbols than opening at " + i + ".");
					error = true;
					break;
				}
			}
		}
		
		if(!error && !stack.isEmpty()){
			System.out.println("More opening symbols than closing.");
			error = true;
		}
		
		if(!error) System.out.println("It is well-formed expression!");  
	}
	
}




