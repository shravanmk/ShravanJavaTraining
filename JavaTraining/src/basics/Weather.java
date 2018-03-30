package basics;

public class Weather {

	public static void main(String[] args) {
		int temperature = 70;
		String weather = "Sunny";
		
		if (temperature > 80) {
			System.out.println("Wear shorts and t-shirt");
		}
		else if (temperature > 60 && weather == "Sunny") {
			System.out.println("Wear shirt and jean");
		}
		else if (temperature > 40 || weather == "Overcast" ) {
			System.out.println("Wear Sweater");
		}
	}
}
