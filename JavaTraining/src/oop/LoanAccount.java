package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void IncreaseRate() {
		System.out.println("Increase Rate");
		}
	
	public void setTerm(int term) {
		System.out.println("Setting term " + term + "years");
	}
	
	public void ammsched() {
		System.out.println("Amorization schedule");
	}

	
}
