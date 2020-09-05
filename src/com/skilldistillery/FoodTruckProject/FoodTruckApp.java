package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruck[] foodTruckArray;

		foodTruckArray = new FoodTruck[5];

		FoodTruck truck1;
		FoodTruck truck2;
		FoodTruck truck3;
		FoodTruck truck4;
		FoodTruck truck5;
		for (int i = 0; i < foodTruckArray.length; i++) {
			System.out.println("Please enter the truck name: ");
			String name = kb.nextLine();
			if(!name.equals("quit")) {
			}
			System.out.println("Please enter the food type:  ");
			String type = kb.nextLine();

			System.out.println("Please enter the truck rating: ");
			int rating = kb.nextInt();
			String blank = kb.nextLine();
			if(name.equals("quit")) {
				
			}

			truck1 = new FoodTruck(name, type, rating);
			truck2 = new FoodTruck(name, type, rating);
			truck3 = new FoodTruck(name, type, rating);
			truck4 = new FoodTruck(name, type, rating);
			truck5 = new FoodTruck(name, type, rating);
			foodTruckArray[i] = truck1;
			foodTruckArray[i] = truck2;
			foodTruckArray[i] = truck2;
			foodTruckArray[i] = truck4;
			foodTruckArray[i] = truck5;
		}
		System.out.println(foodTruckArray[0].infoString());
		System.out.println(foodTruckArray[1].infoString());
		System.out.println(foodTruckArray[2].infoString());
		System.out.println(foodTruckArray[3].infoString());
		System.out.println(foodTruckArray[4].infoString());
	}

}
