package com.car;

import java.util.ArrayList;
import java.util.Scanner;

import inheritance.Animal;

public class CarApp2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userNum ;
		String cont = " ";
		
		
		ArrayList <Car> cars = new ArrayList<>();
		cars.add(new Car("Nikolai","Model S",2017,54999.90));
		cars.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		cars.add(new Car("Chewie","Vette",2017,44989.95));
		cars.add(new UsedCar("Hyonda","Prior",2017,14795.50,35987.6));
		cars.add(new UsedCar("GC","Chirpus",2017,850000, 12345.0));
		cars.add(new UsedCar("GC","Witherell",2017,54999.90,0));
		
		do { // another loop for the continue statement
			//menu- top of loop
			do {
				for (int i = 0; i < cars.size(); i++) {
					System.out.println((i + 1) + ". " + cars.get(i));

				}

				System.out.println("Which car would you like?");
				userNum = scan.nextInt();

				System.out.println(cars.get(userNum - 1));//trying to get the index of location

				System.out.println("Would you like to buy this car? (y/n)");
				scan.nextLine(); //garbage line

				String answer = scan.nextLine();

				if (answer.equalsIgnoreCase("y")) {
					System.out.println("Excellent! Our finance department will be in touch shortly.");
					cars.remove(userNum - 1);

				}


			} while (userNum != (cars.size() + 1)); //when num is less than 7 will loop again
			
			System.out.println("Continue? (y/n)");
			cont = scan.next();
		} while (cont.equalsIgnoreCase("y"));
		System.out.println("goodbye.");
			
	}

}
