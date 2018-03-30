package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
	
		String career;
		System.out.println("Program Starting");
		career = "Software Developer";
		
		int hoursperWeek = 40;
		int weeksperYear = 50;
		double rate = 42.50;
		
		double Salary = hoursperWeek * weeksperYear * rate;
		System.out.println("My Salary as a " + career + "at the rate $" + rate + " per year is " + Salary);
				
				
		
		
	}
	}
