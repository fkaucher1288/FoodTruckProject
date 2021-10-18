package com.SkillDistillery.foodtruck;

import java.util.Iterator;
import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruck [] arrayOfFoodTrucks = new FoodTruck [5];
		FoodTruckApp truckApp = new FoodTruckApp();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrayOfFoodTrucks.length; i++) {
			System.out.println("Input the name");
			String name = sc.nextLine();
			System.out.println("Input the food type");
			String foodType = sc.nextLine();
			System.out.println("What is the rating?");
			Double rating = sc.nextDouble();
			sc.nextLine();
			System.out.println("Would you like to add another food truck? Y or N?");
			String option = sc.nextLine().toUpperCase();
		if (option.equals("Y")) {
            continue;
            } else if (option.equals("N")) {
            break;
            } else { 
                   System.out.println("Sorry, I didn't understand. Please reply Y or N.");
                   option = sc.nextLine();
            
               }
			
			FoodTruck truck = new FoodTruck(name, foodType, rating);
			
			arrayOfFoodTrucks [i] = truck;
			System.out.println(arrayOfFoodTrucks [i]);
		}
		
		
		int userInput;
		boolean userWantsInfo = true;
		while(userWantsInfo) {
			
		System.out.print("1. List all existing food trucks\n" + 
				"2. See the average rating of food trucks\n" + 
				"3. Display the highest-rated food truck\n" + 
				"4. Quit the program");
			userInput = sc.nextInt();
			sc.nextLine();
			switch (userInput) {
			case 1: 
				truckApp.printTruckList(arrayOfFoodTrucks);
				break;
			case 2: 
				truckApp.avgTruckRating(arrayOfFoodTrucks);
				break;
			case 3:
				truckApp.highTruckRating(arrayOfFoodTrucks);
				break;
			case 4: 
				System.out.println("Thank you for using the Food Truck App!");
				userWantsInfo = false;
				break;
			}
		
		
			
		
		}
		sc.close();
		}
		
		
		
	
	
	private void avgTruckRating (FoodTruck[] arrayOfFoodTrucks) {
		double addRating = 0;
		double avgTruckRating = 0;
		double numOfRatings = 0;
		//inside of for loop, wrap everything in an if statement checking to make sure that it
		//is not null	
		for (int i=0; i < arrayOfFoodTrucks.length; i++) {
			if (arrayOfFoodTrucks[i] !=null) {
				double ratings = arrayOfFoodTrucks[i].getRating();
				addRating += ratings;
				numOfRatings = i;
			}
			
		 }
		avgTruckRating = addRating / numOfRatings;
		System.out.println(avgTruckRating);
		
	
		
		
	
	}
	
	private double highTruckRating (FoodTruck[] arrayOfFoodTrucks) {
		double highTruckRating = 0;
		double truck = 0;
	//inside of for loop, wrap everything in an if statement checking to make sure that it
	//is not null	
		for (int i=0; i <arrayOfFoodTrucks.length; i++) {
			if (arrayOfFoodTrucks[i].getRating() > highTruckRating) {
				highTruckRating = arrayOfFoodTrucks[i].getRating();
			
				
			}
			
		}return highTruckRating;
	}
	
	private void printTruckList (FoodTruck [] arrayOfFoodTrucks) {
		
		for (int j = 0; j < arrayOfFoodTrucks.length; j++) {
			if (arrayOfFoodTrucks [j] != null) {
				System.out.println();
			
		}
		
			
		
			
		}
		
	}
	
	
	}
	
	


