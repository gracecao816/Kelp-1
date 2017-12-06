import java.util.Scanner;

public class uiucRestaurants {
	public static void timeOfDay(String userInput) {
		if (userInput.equals("Breakfast")) {
			System.out.println("Morning!");
		}
		if (userInput.equals("Lunch")) {
			System.out.println("Afternoon");

		}
		if (userInput.equals("Dinner")) {
			System.out.println("Night");

		}
	}

	public static void main(String[] args) {

		System.out.println("Hello! You must be hungry! Are you craving Breakfast, Lunch, or Dinner?");

		Scanner scanner = new Scanner(System.in);
		String timeOfDay = scanner.nextLine();
		scanner.close();
		// Calling helper method that takes into account the time in the day 
		timeOfDay(timeOfDay);
		
		

	}

}
