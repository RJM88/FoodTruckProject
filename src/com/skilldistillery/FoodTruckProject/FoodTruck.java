package com.skilldistillery.FoodTruckProject;

public class FoodTruck {
	private String name;
	private String type;
	private int rating;
	private static int truckId;
	private int truckIdNumber;
	
	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", type=" + type + ", rating=" + rating + ", truckIdNumber=" + truckIdNumber
				+ "]";
	}

	public int getTruckIdNumber() {
		return truckIdNumber;
	}

	public void setTruckIdNumber(int truckIdNumber) {
		this.truckIdNumber = truckIdNumber;
	}


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

	public static int getTruckId() {
		return truckId;
	}

	public static void setTruckId(int truckId) {
		FoodTruck.truckId = truckId;
	}


}
