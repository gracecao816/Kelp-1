import java.util.Scanner;

public class uiucRestaurants {
	public static void timeOfDay(String userInput) {
		
		
		if (userInput.equals("morning")) {
			System.out.println("Breakfast!");
		}
		if (userInput.equals("afternoon")) {
			System.out.println("Lunch");

		}
		if (userInput.equals("night")) {
			System.out.println("Dinner");

		}
	}

	public static void main(String[] args) {

		System.out.println("Hello! You must be hungry! What time of day is it (Morning, Afternoon, Night)?");

		Scanner scanner = new Scanner(System.in);
		String timeOfDay = scanner.nextLine();
		scanner.close();
		String test = timeOfDay.toLowerCase();
		// Calling helper method that takes into account the time in the day 
		timeOfDay(test);
		
		
		
		

	}

}
