package jrJava.Declarations;

import trace.Trace;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hisMoney = 50;
		int herMoney = 100;
		
		if(hisMoney >= herMoney){
			int difference = hisMoney - herMoney;
			int bonus = difference*2;
			herMoney = herMoney + bonus;
			
		}
		else {
			int difference = herMoney - hisMoney;
			int bonus = difference/2;
			hisMoney = hisMoney + bonus;
			
		}
		System.out.println("His Money is " + hisMoney);
		System.out.println("Her Money is " + herMoney);
		Trace.trace("jrJava.Declarations", "Practice3");
	}

}
