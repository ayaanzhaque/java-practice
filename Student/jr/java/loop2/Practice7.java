package jr.java.loop2;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i=1; i <100; i++){
			if (i % 4 == 0 || i >20 && i <29) continue;	
			sum += i*i;
			if (sum % 100 == 0){ 
				System.out.println(i);
				break;
			}
		}
		System.out.println(sum);

	}

}
