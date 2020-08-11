package jrJava.stack_1;

import java.util.Scanner;

public class Reverser {

	private String expression;
	private Stack stack;
	
	
	public void setExpression(String expression){
		this.expression = expression;
		stack = new Stack(expression.length());
	}
	
	public String reverse(){
		char ch;
		for(int i=0; i<expression.length(); i++){
			stack.push(expression.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exp;
		Reverser r = new Reverser();
		
		while(true){
			System.out.println("Enter a line of text:");
			exp = scanner.nextLine();
			if(exp.length()==0) break;
			
			r.setExpression(exp);
			System.out.println(r.reverse());
		}
		scanner.close();
	}
}



