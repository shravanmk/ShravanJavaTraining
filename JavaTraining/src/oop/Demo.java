package oop;

class Company {
	
	String name;
	int emp_id;
	String designation;
	
	
	void detail () {
		System.out.println("Name is " + name);
	}
	
	void id () {
		System.out.println("ID is " + emp_id);
	}
	
	void Role () {
		System.out.println("Desigantion role is " + designation);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // This is instantiating an object
		Company company1 = new Company();
		
		//defining properties
		company1.name = "Shravan";
		company1.emp_id = 553498;
		company1.designation = "AST";
		
		//This is abstraction
		company1.detail();
		company1.id();
		company1.Role();
		
	}

}
