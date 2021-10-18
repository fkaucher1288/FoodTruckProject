package com.SkillDistillery.foodtruck;

public class FoodTruck {
	String name;
	String foodType;
	double rating;
	private int id;
	static int idCount = 0;
	public FoodTruck(String name, String foodtype, double rating) {
		super();
		this.name = name;
		this.foodType = foodtype;
		this.rating = rating;
		this.id = idCount;
		idCount++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", id=" + id + "]";
	}
	
			
}
