package basics;

public class NumbersCalc {

	public static void main(String[] args) {
	    System.out.println("Program is Starting");
		printname();
		int NumA = 10;
		int NumB = 20;
		addNumbers(NumA,NumB);
		int product = multiplyNumbers(NumA,NumB);
		System.out.println(product);
	}	
	static void printname() {
		System.out.println("My name is Shravan");
	}

	static void addNumbers(int numberA, int numberB ) {
		int sum = numberA + numberB;
		System.out.println("Sum of " + numberA + " and " + numberB + " is " + sum);
	}

	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
		
	}



}
	
	

