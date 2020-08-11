package jrJava.recursion3;

public class HanoiTower {

	public static void main(String[] args) {
		
		moveDisks(10, 'A', 'C', 'B');

	}
	
	public static void moveDisks(int N, char from, char to, char stage){
		
		if(N==1){
			System.out.println("Move block " + N + " from " + from + " to " + to);
			return;
		}
		
		moveDisks(N-1, from, stage, to);
		System.out.println("Move block " + N + " from " + from + " to " + to);
		moveDisks(N-1, stage, to, from);
		
	}

}
