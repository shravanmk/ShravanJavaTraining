package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount();
		//acc1.name = "Shravan";
		
		//Encapsulation : public API
		acc1.getName("Shravan Mk");
		System.out.println(acc1.setName());
		acc1.getAadhar(455899233);
		System.out.println(acc1.setAadhar());
		
		acc1.setRate();
		acc1.IncreaseRate();
			
		acc1.accountnumber = 123456789;
		acc1.balance = 40000;
	
		
		acc1.Deposit(10000);
		acc1.Deposit(10000);
		acc1.Deposit(10000);
		acc1.withdraw(10000);
		
		System.out.println(acc1.toString());
		/*
		
		System.out.println("The IFSC CODE is " + acc1.ifsc_code);
		BankAccount acc2 = new BankAccount("SAVINGS ACCOUNT");
		BankAccount acc3 = new BankAccount(12345,100);
		acc3.CheckBalance();
		//BankAccount acc4 = new BankAccount("SAVINGS ACCOUNT");
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.name = "Athira";
		cd1.interestRate = 8.98;
		cd1.accountnumber = 987654321;
		cd1.balance = 50000;
		System.out.println(cd1.toString());
		cd1.compund();
		*/
	}

}
