package jrJava.stack_4_calculator;

import java.util.ArrayList;

public class Calculator {

	private static final String ALL_OPS = "+-*/%^()";
	private static final int[] LEVEL = {1,1,2,2,2,3,0,0}; 
	
	private String exp;
	private Stack<String> opStack, dataStack;
	
	
	public Calculator(String exp){
		this.exp = exp;
		opStack = new Stack<String>(20);
		dataStack = new Stack<String>(20);
	}
	
	
	public void calculate(){
		ArrayList<String> tokens = tokenize();
		
		String token;
		for(int i=0; i<tokens.size(); i++){
			token = tokens.get(i);
			
			if(ALL_OPS.indexOf(token)>=0){
				
				if(token.equals("(")) opStack.push(token);
				else if(token.equals(")")){
					repeatOpsTillParenthesis();
				}
				else if(seesHigherOrEqualTopOp(token)){
					repeatOpsTillLowerTopOp(token);
					opStack.push(token);
				}
				else {
					opStack.push(token);
				}
			}
			else {
				dataStack.push(token); 
			}
		}
		
		repeatOpsTillEmpty();
		System.out.println("Result = " + dataStack.pop());
	}
	
	
	private boolean seesHigherOrEqualTopOp(String token){
		if(opStack.isEmpty()) return false;
		return LEVEL[ALL_OPS.indexOf(opStack.peek())] >= LEVEL[ALL_OPS.indexOf(token)];
	}
	
	
	private void repeatOpsTillParenthesis(){
		while(true){
			if(opStack.peek().equals("(")){
				opStack.pop();
				break;
			}
			processOp();
		}
	}
	
	
	private void repeatOpsTillEmpty(){
		while(!opStack.isEmpty()) processOp();
	}
	
	
	private void repeatOpsTillLowerTopOp(String token){
		
		while(!opStack.isEmpty()) {
			if(LEVEL[ALL_OPS.indexOf(opStack.peek())] < LEVEL[ALL_OPS.indexOf(token)]) break;
			processOp();
		}
		
	}
	
	
	private void processOp(){
		String op = opStack.pop();
		double data2 = Double.parseDouble(dataStack.pop());
		double data1 = Double.parseDouble(dataStack.pop());
		
		if(op.equals("+")) dataStack.push(String.valueOf(data1 + data2));
		else if(op.equals("-")) dataStack.push(String.valueOf(data1 - data2));
		else if(op.equals("*")) dataStack.push(String.valueOf(data1 * data2));
		else if(op.equals("/")) dataStack.push(String.valueOf(data1 / data2));
		else if(op.equals("%")) dataStack.push(String.valueOf(data1 % data2));
		else if(op.equals("^")) dataStack.push(String.valueOf(Math.pow(data1, data2)));
	}
	
	
	
	public ArrayList<String> tokenize(){
		ArrayList<String> tokens = new ArrayList<String>();
		
		int pos1=0, pos2;
		char ch;
		String data;
		for(int i=0; i<exp.length(); i++){
			ch = exp.charAt(i);
			if(ALL_OPS.indexOf(ch)>=0){
				pos2 = i;
				data = exp.substring(pos1, pos2).trim();
				
				if(data.length()>0) tokens.add(data);
				tokens.add(String.valueOf(ch));
				pos1 = pos2+1;
			}
			else if(i==exp.length()-1){
				data = exp.substring(pos1).trim();
				if(data.length()>0) tokens.add(data);
			}	
		}
		return tokens;
	}
	
}








