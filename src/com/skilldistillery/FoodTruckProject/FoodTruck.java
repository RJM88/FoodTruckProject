package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruck {
	private String name;
	private String type;
	private int rating;
//	private int maxTrucks = 5;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String type, int rating) {
		this.name = name;
		this.type = type;
		this.rating = rating;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


	public String toString() {
		String info = "Name of truck: " + getName() + ", Type of food: " + getType() + ", Rating of food: "
				+ getRating();
		return info;
	}

//	public void displayTruckInfo() {
//		String truckInfo = toString();
//		System.out.println(truckInfo);
//	}			

}
