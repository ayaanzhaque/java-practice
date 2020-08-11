package jrJava.inheritance7_polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Dog ref = new Husky();
		ref.move();
		
		Animal ref2 = new Retriever();
		
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.train( new Dog());
		

	}

}
