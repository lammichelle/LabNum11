package composition;

import java.util.ArrayList;
import java.util.Scanner;

public class BasketBallCoachesApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		ArrayList <Person> list = new ArrayList<>();
		
		System.out.println("How many coaches do you want to add?");
		int userNum = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < 2; i++) { //only need 2 ppl (head and assist)
			System.out.println("First Name: ");
			String fName = scan.nextLine();
			System.out.println("Last Name: ");
			String lName = scan.nextLine();
			System.out.println("Address: ");
			String addy = scan.nextLine();
			System.out.println("Age: ");
			int age = scan.nextInt();
			scan.nextLine();
			
			list.add(new Person(fName, lName, age, addy));
			
		}
		
		BasketBallCoaches coaches = new BasketBallCoaches(list.get(0), list.get(1));
		coaches.printCoaches();

		scan.close();
		

	}

}
