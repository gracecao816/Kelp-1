import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uiucRestaurants {
	public static void timeOfDay(String userInput) {
		
		
		if (userInput.equals("morning")) {
			System.out.println("Breakfast it is!");
		}
		if (userInput.equals("afternoon")) {
			System.out.println("Lunch it is!");

		}
		if (userInput.equals("night")) {
			System.out.println("Dinner it is!");

		}
	}
	
public static void typeOfFood(String userInput) {
		
		
		if (userInput.equals("asian")) {
			System.out.println("Let us show you some options!");
		}
		if (userInput.equals("american chain restaurants")) {
			System.out.println("Let us show you some options!");

		}
		if (userInput.equals("pub food")) {
			System.out.println("Let us show you some options!");

		}
		if (userInput.equals("mexican")) {
			System.out.println("Let us show you some options!");

		}
		if (userInput.equals("pizza")) {
			System.out.println("Let us show you some options!");

		}
		if (userInput.equals("greek")) {
			System.out.println("Let us show you some options!");

		}
		if (userInput.equals("dessert or coffee")) {
			System.out.println("Let us show you some options!");

		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Hello! You must be hungry! What time of day is it (Morning, Afternoon, Night)?");

		Scanner scanner = new Scanner(System.in);
		String timeOfDay = scanner.nextLine();
		
		String test = timeOfDay.toLowerCase();
		// Calling helper method that takes into account the time in the day 
		timeOfDay(test);
		
		System.out.println("What type of food would you like? Your options are: "
				+ "Asian, American Chain Restaurants, Pub Food, Mexican, Pizza, Greek, Dessert or Coffee");

		Scanner foodScanner = new Scanner(System.in);
		String foodOption = foodScanner.nextLine();
		String food = foodOption.toLowerCase();
		// Calling helper method that takes into account the genre of food to get 
		typeOfFood(food);
		
		foodScanner.close();
		scanner.close();
		
		Scanner inGSR = new Scanner(new File("greenStreetRestaurants"));
		StringBuilder sb = new StringBuilder();
		while (inGSR.hasNext()) {
			sb.append(inGSR.nextLine());
		}
		String[] array = sb.toString().split("\n");
		inGSR.close();

	}

}
