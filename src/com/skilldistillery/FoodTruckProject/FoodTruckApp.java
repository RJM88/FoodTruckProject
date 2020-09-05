package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		boolean quit = false;

		FoodTruck[] foodTruckArray;

		foodTruckArray = new FoodTruck[5];

		for (int i = 0; i < foodTruckArray.length; i++) {
			FoodTruck foodTruck = new FoodTruck();

			System.out.println("Please enter the truck name: ");
			String name = kb.nextLine();

			if (name.equals("quit")) {
				System.out.println("No entry.");
				foodTruckArray[i] = foodTruck;
				continue;
			} else {
				foodTruck.setName(name);

				System.out.println("Please enter the food type:  ");
				String type = kb.nextLine();
				foodTruck.setType(type);

				System.out.println("Please enter the truck rating: ");
				int rating = kb.nextInt();
				kb.nextLine();
				foodTruck.setRating(rating);
				foodTruckArray[i] = foodTruck;
			}
		}
		while (!quit) {
			System.out.println("1.) List all existing food trucks.");
			System.out.println("2.) See the average rating of food trucks.");
			System.out.println("3.) Display the highest-rated food truck.");
			System.out.println("4.) Quit the program.");
			System.out.println();
			int userChoice = kb.nextInt();
			switch (userChoice) {
			case 1:
				for (FoodTruck foodTruck : foodTruckArray) {
					if (foodTruck.getName() != null) {
						System.out.println(foodTruck);
					}
				}
				break;
			case 2:
				int ratingTracker = 0;
				int ratingDivider = 0;
				for (FoodTruck foodTruck : foodTruckArray) {
					if (foodTruck.getName() != null) {
						ratingTracker += foodTruck.getRating();
						ratingDivider += 1;
					}

				}
				System.out.println(ratingTracker / ratingDivider );
				break;

				
			case 3:
				FoodTruck highRatedFoodTruck = new FoodTruck();
				for (FoodTruck foodTruck : foodTruckArray) {
					if (foodTruck.getName() != null && highRatedFoodTruck.getName() == null) {
						highRatedFoodTruck = foodTruck;
						
					}else if (highRatedFoodTruck.getName() != null) {
						if(highRatedFoodTruck.getRating() < foodTruck.getRating())
							highRatedFoodTruck = foodTruck;
					}
					
				}
				System.out.println(highRatedFoodTruck);
				break;
				
			case 4:
					System.out.println("GoodBye!");
					quit = true;
					break;
			default:
				System.out.println("Not valid");
			}

		}

	}

}
