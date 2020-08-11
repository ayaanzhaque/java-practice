package jrJava.loops3;

public class Practice2 {

	public static void main(String[] args) {
		int i, j;
		
		for (i = 2 ; i < 10 ; i++ ){
			if (i == 4) continue;
			for(j = 2; j < 10 ; j++ ){
				System.out.println(i  + " x " + j + " = " + i*j);
				
			}
			System.out.println();
		}
		
		
		
	}

}

