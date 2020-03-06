import java.util.Scanner;
public class Project4 {
	
	public static String input (int x ) {
		
		Scanner in = new Scanner (System.in);
		
		
		double temp = 0;
		double windSpeed = 0;
		String windDirection;
		String weather = "";
		
		
		System.out.print("What is the temperature in degrees Fahrenheit?: ");
		temp = in.nextDouble();
		
		System.out.print("What is the wind speed in miles per hour?: ");
		windSpeed = in.nextDouble();
		
		System.out.print("What is the wind direction?: ");
		windDirection = in.next();
		
		weather = ("Temperature: " +temp+ "°F\nWind Speed: " +windSpeed+ "mph\nWind Direction: " +windDirection+ "\n");
		
		System.out.println("");
		
		return weather;
		
		
		
	}
	
	public static String output (boolean y, String z) {
		
		String weather = z;
		
		if (y == false) {
			
			System.out.println("No weather has been recorded.");
			
		}	
					
		return weather;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int choice;
		String weather = "";
		boolean firstWeather = false;
		
		boolean looping = true;
				
		while (looping == true) {
		
		System.out.println("What would you like to do?:");
		System.out.println("1) Input new weather data.");
		System.out.println("2) Print the most recent data");
		System.out.println("3) Exit program");
		
		choice = in.nextInt();
		
		if (choice == 1 ) {
			
			weather = input(choice);
			firstWeather = true;
		
		} else if (choice == 2) {
			
			System.out.println(output(firstWeather, weather));
			
			
		} else if (choice == 3) {
			
			System.out.println();
			System.out.println("Goodbye!");
			looping = false;
			
		} else {
			
			System.out.println("Sorry, that's not a valid choice, please try again");
			System.out.println();
								
		}
			
		}
		
	}

}