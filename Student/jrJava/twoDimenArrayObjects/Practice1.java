package jrJava.twoDimenArrayObjects;

public class Practice1 {

	public static void main(String[] args) {

		Employee[] source = Utility.loadEmployeeArrayFromFile("jrJava/twoDimenArrayObjects/employee.txt");

		//Employee[][] dest = new Employee[4][];
		//dest[0] = new Employee[3];
		//dest[1] = new Employee[4];
		//dest[2] = new Employee[2];
		//dest[3] = new Employee[5];
		
		Employee[][] dest = new Employee[4][3];
		
		transfer(source, dest);
		print(dest);

	}

	public static void transfer(Employee[] source, Employee[][] dest){

		int count = 0;
		
		for(int i = 0; i < dest.length; i++){
			for(int j = 0; j < dest[i].length; j++){
				dest[i][j] = source[count];
				count++;
			}
		}

	}

	public static void print(Employee[][] data){

		for(int i=0; i<data.length; i++){

			if(data[i]==null){
				System.out.println("null");
				continue;
			}

			for(int j=0; j<data[i].length; j++){
				System.out.print(data[i][j] + "  ");
			}
			System.out.println();
		}

	}


}
