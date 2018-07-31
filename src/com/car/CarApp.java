package com.car;

import java.util.ArrayList;
import java.util.Scanner;

import composition.Person;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <Car> cars = new ArrayList<>();
		
		
		System.out.println("How many cars would you like to enter?");
		int userNum = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < userNum; i++) {
		System.out.println("Enter Car #" + (i+1) + " Make: ");
		String carMake = scan.next();
		System.out.println("Enter Car #" + (i+1) + " Model: ");
		String carModel = scan.next();
		System.out.println("Enter Car #" + (i+1) + " Year: ");
		int carYear = scan.nextInt();
		System.out.println("Enter Car #" + (i+1) +" Price: $");
		double carPrice = scan.nextDouble();
		scan.nextLine();
		
		cars.add(new Car(carMake, carModel, carYear, carPrice));
		}

		for (Car c : cars) {
			System.out.println(c.toString());
		//	System.out.println(c.getMake() + "\t" + c.getModel() + "\t" +c.getYear() + "\t" +c.getPrice());
		}
		
		scan.close();
	
		
		
	}

}
