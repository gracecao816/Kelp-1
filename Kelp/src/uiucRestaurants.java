import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
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
public static void choice(String userInput) {
	
	
	if (userInput.equals("random generator")) {
		System.out.println("Continue");
	}
	if (userInput.equals("input your requirements")) {
		System.out.println("Continue");

	}
}

	public static void main(String[] args) {  
		System.out.println("Would you like to use our random generator or input your requirements?");
		Scanner userChoice = new Scanner(System.in);
		String choice = userChoice.nextLine();
		
		String option = choice.toLowerCase();
		// Calling helper method that takes into account the time in the day 
		choice(option);

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
		
		String filePath = "resources/restaurants/greenStreetRestaurants";
		try {
			LineNumberReader lineReader = new LineNumberReader (new FileReader(filePath));
			String lineText = null;
			
			while ((lineText = lineReader.readLine())!= null) {
				System.out.println(lineReader.getLineNumber()+ ":" + lineText);
			}
			lineReader.close();
		} catch (IOException ex)
		{
			System.err.println(ex);
		}
	}

}
