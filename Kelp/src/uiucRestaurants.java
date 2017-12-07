import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.net.URI;
//import java.security.InvalidParameterException;
//import java.util.ArrayList;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.List;
//import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

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
	
	// Splitting up Green Street Text File into genres 
	public static void genreOfFoodScript(int start, int finish) {
		String filePath = "resources/restaurants/greenStreetRestaurants.txt";
		try {
			LineNumberReader lineReader = new LineNumberReader(new FileReader(filePath));
			String lineText = null;

			while ((lineText = lineReader.readLine()) != null) {
				int lineNumber = lineReader.getLineNumber();
				if (lineNumber >= start && lineNumber <= finish) {
					System.out.println(lineText);
				}
			}
			lineReader.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	public static void typeOfFood(String userInput) {

		if (userInput.equals("asian")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(2, 31);

		}

		if (userInput.equals("american chain restaurants")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(34, 55);

		}
		if (userInput.equals("pub food")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(58, 63);
		}
		if (userInput.equals("mexican")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(66, 69);

		}
		if (userInput.equals("pizza")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(74, 77);

		}
		if (userInput.equals("greek")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(80, 83);

		}
		if (userInput.equals("dessert or coffee")) {
			System.out.println("Let us show you some options!");
			genreOfFoodScript(86, 95);
		}
	}

	public static void main(String[] args) {

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


	}

}
