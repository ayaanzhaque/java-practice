package jrJava.multi_threading_1;

public class SquareRootSumTask {

	public void doTask() {

		int sum = 0;

		for(int i = 1; i <= 10; i++) {
			sum+=i*i;
			System.out.println("in squaresumtask: sum =" + sum);
		}

	}
}