import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
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

	public static void userGenerated() {
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

	// surprise random option
	public static void surpriseMe(int start, int finish, int times) {
		String filePath = "resources/restaurants/surpriseRecommendations.txt";
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

	//
	public static void choice(String userInput) {

		if (userInput.contains("random")) {
			System.out.println("We recommend...");
			int begin = (int) (Math.random() * 26);
			surpriseMe(begin, begin, 1);
		}
		if (userInput.equals("input")) {
			// System.out.println("Continue");
			userGenerated();

		}
	}

	public static void nextChoice(String nextChoiceOption) {
		if (nextChoiceOption.contains("yes")) {
			System.out.println("We recommend...");
			int begin = (int) (Math.random() * 26);
			surpriseMe(begin, begin, 1);
		}
		if (nextChoiceOption.contains("no")) {
			userGenerated();
		}

	}
	//ask for number of recommendations to generate (if > 10, tell them to go away)
	public static void numberOfRecommendations(int recommendations) {
		if(recommendations >= 0 && recommendations <= 10) {
			System.out.println("We recommend...");
			for (int j = 0; j < recommendations; j++) {
			int begin = (int) (Math.random() * 26);
			surpriseMe(begin, begin, recommendations);
			}
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

		System.out.println("Would you like to use our random generator or input your requirements?");
		Scanner userChoice = new Scanner(System.in);
		String choice = userChoice.nextLine();

		String option = choice.toLowerCase();
		 //Calling helper method that takes into if the user wants to go random or input parameters
		choice(option);
		
		if(option.contains("random")) {
		System.out.println("How many more recommendations would you like?");
		Scanner numberRecommendations = new Scanner(System.in);
		String numRecommendations = numberRecommendations.nextLine();
		int intNumRecommendations = Integer.parseInt(numRecommendations);			
		numberOfRecommendations(intNumRecommendations);
		


		/**if (option.contains("random")) {
			System.out.println("Would you like to try again? (Yes or No?)");
			Scanner nextUserChoice = new Scanner(System.in);
			String nextChoice = nextUserChoice.nextLine();
			String nextChoiceOption = nextChoice.toLowerCase();
			nextChoice(nextChoiceOption);
			nextUserChoice.close();*/
			

			/**if (nextChoiceOption.contains("yes")) {
				System.out.println("Would you like to try again? (Yes or No?)");
			}*/
			
		}

		// System.out.println("Hello! You must be hungry! What time of day is it
		// (Morning, Afternoon, Night)?");
		// Scanner scanner = new Scanner(System.in);
		// String timeOfDay = scanner.nextLine();
		//
		// String test = timeOfDay.toLowerCase();
		// // Calling helper method that takes into account the time in the day
		// timeOfDay(test);
		//
		// System.out.println("What type of food would you like? Your options are: "
		// + "Asian, American Chain Restaurants, Pub Food, Mexican, Pizza, Greek,
		// Dessert or Coffee");
		//
		// Scanner foodScanner = new Scanner(System.in);
		// String foodOption = foodScanner.nextLine();
		// String food = foodOption.toLowerCase();
		// // Calling helper method that takes into account the genre of food to get
		// typeOfFood(food);
		//
		// foodScanner.close();
		// scanner.close();
		//userChoice.close();

	}

}
