package basics;

public class Lab1 {
	
	public static void main(String[] args) {
		// Write a function that takes n as a value and sum of 1 to n
        System.out.println(sum(4));
        
        // Write a function to compute factorial hint: use recursion
        System.out.println("the factorial is " + fact(4));
        
        //Write 3 functions to return min, avg and max of an array
        
        	}

	
	
	//This is the function to sum to n value
	public static int sum(int n) {
		int sum = 0;
		for (int i=0; i<= n; i++){
			sum = sum + n;
		}
		return sum;
	}
	
	//This is the function to compute factorial
	public static int fact(int f) {
		if (f == 0) {
			return 1;		
		}		
	return fact(f-1) * f;
	}	
}
