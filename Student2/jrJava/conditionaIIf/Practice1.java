package jrJava.conditionaIIf;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double yourMoney = 50.01;
		
		if(yourMoney<50){
			System.out.println("You Poor Thing!");
			double bonus = 0.1 * yourMoney;
			// yourMoney = bonus + yourMoney;
			yourMoney += bonus;		
		}
		System.out.println(yourMoney);
		
		
	}

}
