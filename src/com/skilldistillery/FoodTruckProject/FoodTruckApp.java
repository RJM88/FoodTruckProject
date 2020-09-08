package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // Setting up Scanner for user input.
		int truckIdTracker = 1;
		boolean quit = false; // boolean used for the while loop.

		FoodTruck[] foodTruckArray = new FoodTruck[5];// Declaring and initializing the food truck array.
		// This for loop will take all the user input and enter it into the food truck
		// array.
		for (int i = 0; i < foodTruckArray.length; i++) {
			FoodTruck foodTruck = new FoodTruck(); // creating a new food truck object.

			System.out.println("Please enter the truck name: "); // Prompting user input for truck name.
			String name = kb.nextLine(); // will store user input in a variable.

			/*
			 * if statement will check to see if truck name == quit. if it does, that truck
			 * will be skipped and the program will continue
			 */
			if (name.equals("quit")) {
				System.out.println("No entry.");
				foodTruckArray[i] = foodTruck;
				continue; // Will allow the program to continue with the for loop with no user input.
			} else {
				foodTruck.setName(name);

				System.out.println("Please enter the food type:  "); // Prompting user input for food type.
				String type = kb.nextLine(); // will store user input in a variable.
				foodTruck.setType(type);

				System.out.println("Please enter the truck rating: "); // Prompting user input for truck rating.
				int rating = kb.nextInt(); // will store user input in a variable.
				kb.nextLine(); // blank line to prevent the next Int from skipping forward.
				foodTruck.setRating(rating);
				foodTruck.setTruckIdNumber(truckIdTracker++);
				foodTruckArray[i] = foodTruck;
			}
		}
		while (!quit) {
			System.out.println(); // blank line for spacing
			// Menu option 1 will list all trucks entered.
			System.out.println("1.) List all existing food trucks.");
			// Menu option 2 will list the average of all trucks entered.
			System.out.println("2.) See the average rating of food trucks.");
			// Menu option 3 will list the highest rated food truck..
			System.out.println("3.) Display the highest-rated food truck.");
			// Menu option 4 will break the while loop and end the program.
			System.out.println("4.) Quit the program.");
			System.out.println(); // blank line for spacing
			int userChoice = kb.nextInt(); // will store uses menu choice into a variable.
			switch (userChoice) { // Switch will take userChoice variable and look to see if it matches any of its
									// cases otherwise return default option.
			case 1: // Case 1 will display all food trucks with a truck ID. that was entered.

				for (FoodTruck foodTruck : foodTruckArray) { // for each loop will work through the food truck array.
					if (foodTruck.getName() != null) { // if the food truck/ private sting name doesn't == null...
						System.out.println(foodTruck); // Will print the truck info from the food truck array.
					}
				}
				break;
			case 2: // Case 2 will display the average off all the food trucks.
				int ratingTracker = 0;
				int ratingDivider = 0;
				for (FoodTruck foodTruck : foodTruckArray) { // for each loop will work through the food truck array.
					if (foodTruck.getName() != null) { // if the food truck/ private sting name doesn't == null...
						// Will add the rating for each truck to ratingTacker variable
						ratingTracker += foodTruck.getRating();
						ratingDivider += 1; // Will add 1 to ratingDivider variable.
					}

				}
				// Will do the math ratingTracker ( sum of ratings ) / ratingDivider ( the
				// number of trucks ).
				System.out.println("Average rating of the food trucks: " + (ratingTracker / ratingDivider));
				// After the math, the average rating will be displayed.
				break;

			case 3:
				FoodTruck highRatedFoodTruck = new FoodTruck(); // creating a new food truck object.
				for (FoodTruck foodTruck : foodTruckArray) { // for each loop will work through the food truck array.
					
					if (foodTruck.getName() != null && highRatedFoodTruck.getName() == null) { 
						highRatedFoodTruck = foodTruck;

					} else if (highRatedFoodTruck.getName() != null) {
						if (highRatedFoodTruck.getRating() < foodTruck.getRating())
							highRatedFoodTruck = foodTruck;
					}

				}
				System.out.println("The highest rated food truck is: ");
				System.out.println(highRatedFoodTruck);
				break;

			case 4:
				System.out.println("Good Bye!"); // Will display Good Bye,
				// Change the quit boolean to true. When the quit boolean = true, it will break
				// out of the while loop and end the program.
				quit = true;
				break;
			default:
				System.out.println("Not valid"); // Will display if user input does not match any cases.
			}

		}

	}

}
