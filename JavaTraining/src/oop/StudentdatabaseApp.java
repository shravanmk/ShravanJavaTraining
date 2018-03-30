package oop;

public class StudentdatabaseApp {

	public static void main(String[] args) {
		StudentDatabase st1 = new StudentDatabase ("Shravan","234567", 1000);
		st1.checkBalance(1000);
		st1.setCity("Chennai");
		System.out.println(st1.getCity());	
		
}
}
	
	class StudentDatabase{
		
		private static int  ID = 100;
		private String name;
		private String ssn;
		private String emailid;
		private String userid;
		private int phone;
		private String city;
		private String State;
		private double balance;
		
		public StudentDatabase(String name, String ssn, double initpayment){
			String emailid = name + "@tcs.com";
			balance = initpayment;
			this.ssn = ssn;
			ID++;
			setuserid();
	        }
	
		public void setuserid(){
			int random = (int) (Math.random() * 10000);
			String userid = ID + random + ssn.substring(0,4);
			System.out.println(userid);
					}
		
		
		public void enroll(){
			System.out.println("YOU ARE ENROLLED");
		}
		
		public void pay(int amount){
			System.out.println("PAYMENT of $" + amount + " is made");
		}
		
		public void checkBalance(int amount){
			balance = amount;
			System.out.println(balance);
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			this.State = state;
		}
		
	
		
	}

