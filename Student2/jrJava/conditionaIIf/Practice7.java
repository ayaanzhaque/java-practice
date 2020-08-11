package jrJava.conditionaIIf;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 95;
		if (score >= 90){
			System.out.println("Excellent! We are proud of you");
			System.out.println("$100");
		}
		else if (score >= 80){
			System.out.println("Thats still great! Important thing is you did your best");
			System.out.println("$1");
		}
		else if (score >= 70){
			System.out.println("Whats new?");
		}
		else if (score >= 60){
			System.out.println("You brought shame to our family");
			System.out.println("Here is your punishment, 10 push-ups");
		}
		else{
			System.out.println("D!@#$%^");
			System.out.println("We disown you. Get out!");
		}
		
	}

}
