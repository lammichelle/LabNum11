package composition;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Person p = new Person("Grant", " Chirpus", 5, " 1570 Wooward"); 
		//created obj using the parameter format from my helper class
		Person p1 = new Person(); 
		p1.setFirstName("Jacob");
		p1.setLastName("Quickert"); 
		p1.setAge(29);
		p1.setAddress("555 Main St");
		
		
		BasketBallCoaches coaches = new BasketBallCoaches(p,p1); //put in two person in parameters
		// if put in (new person(), new person()) - it will give default info
		coaches.printCoaches();
		System.out.println(coaches.getAssistantCoach().getFirstName()); //if want to be specific
	//////////////////////////////////////////////////////////////////////////////////////	
		//arraylist ex
		ArrayList<Person> list = new ArrayList<>();
		System.out.println("How many ppl do you want to add?");
		//int to string , so garbage line
		int userNum = scan.nextInt();
		scan.nextLine(); //garbaage line 
		
		
			
		for (int i = 0; i < userNum; i++) {
		System.out.println("Please enter info for a head coach ");
		System.out.println("First Name: ");
		String fName = scan.nextLine();
		System.out.println("Last Name: ");
		String lName = scan.nextLine();
		System.out.println("Address: ");
		String addy = scan.nextLine();
		System.out.println("Age: ");
		int age = scan.nextInt();
		scan.nextLine();
		//person temp = new person(fName, lName, age, addy);
		list.add(new Person(fName, lName, age, addy));
		

	}
		
		System.out.println(list);
		scan.close();
	
	//////////////////////////////////////////////////////////////////////////
	//another example	
	
//	System.out.println("Please enter info for a head coach ");
//		System.out.println("First Name: ");
//		
//		String fName = scan.nextLine();
//		
//		System.out.println("Last Name: ");
//		String lName = scan.nextLine();
//		
//		System.out.println("Address: ");
//		String addy = scan.nextLine();
//		
//		System.out.println("Age: ");
//		int age = scan.nextInt();
//		
//		Person temp = new Person(fName, lName, age, addy);
//		System.out.println(temp);
		
		
		
		
		

	}

}
