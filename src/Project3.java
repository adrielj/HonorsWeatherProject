import java.util.Scanner;
public class Project3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		int choice;
		String stationName = "";
		double temp = 0;
		double windSpeed = 0;
		String windDirection;
		String weather = "";
		
		boolean looping = true;
				
		while (looping == true) {
		
		System.out.println("What would you like to do?:");
		System.out.println("1) Input new weather data.");
		System.out.println("2) Print the most recent data");
		System.out.println("3) Exit program");
		
		
		choice = in.nextInt();
		
		if (choice == 1 ) {
			
			System.out.print("What is the name of the station?: ");
			stationName = in.next();
			
			System.out.print("What is the temperature in degrees Fahrenheit?: ");
			temp = in.nextDouble();
			
			System.out.print("What is the wind speed in miles per hour?: ");
			windSpeed = in.nextDouble();
			
			System.out.print("What is the wind direction?: ");
			windDirection = in.next();
			
			weather = ("The " +stationName+ " Weather Station\nTemperature: " +temp+ "°F\nWind Speed: " +windSpeed+ "mph\nWind Direction: " +windDirection+ "\n");
		
			System.out.println();
			
		} else if (choice == 2) {
			
			if (weather.equals("")) {
				
				System.out.println("No weather has been recorded.");
				
			} else
			
			System.out.println(weather);
			System.out.println();
			
			
		} else if (choice == 3) {
			
			System.out.println();
			System.out.println("Goodbye!");
			in.close();
			looping = false;
			
		} else {
			
			System.out.println("Sorry, that's not a valid choice, please try again");
			System.out.println();
								
		}
			
		}
		
	}

}