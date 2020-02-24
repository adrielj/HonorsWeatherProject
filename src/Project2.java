import java.util.Scanner;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		String stationName;
		double temp;
		double windSpeed;
		String windDirection;
		
		System.out.print("Please name the weather station: ");
		stationName = in.next();
		
		System.out.print("Please input the temperature, in degrees Fahrenheit: ");
		temp = in.nextDouble();
		
		System.out.print("Please input the wind speed: ");
		windSpeed = in.nextDouble();
		
		System.out.print("Please input the wind direction: ");
		windDirection = in.next();		
		
		System.out.println("The " +stationName+ " Weather Station");
		System.out.println("Temperature: " +temp+ "°F");	
		System.out.println("Wind Speed/Direction: " +windSpeed+ " mph " +windDirection);
				
	}

}
