package inheritance;

import java.util.ArrayList;

public class AnimalApp {

	public static void main(String[] args) {
		Animal a = new Animal ("Teddy", "male", 35); //Animal constructor - parent
		a.setName("Frank"); //will override
		a.setName("Meesh");
		
		System.out.println(a);
		
		
		Cat c= new Cat("Fluffy", "female", 2, "long hair");//child
		//to add hair type, we can either use setter or overloaded constructor
		c.setHairType("short hair");
		System.out.println(c);
		
		////////////////////////////////////////////////////////////////////
		
		//default - java will implicitly cast child to animal
		Animal catDad = new Cat("test","male", 1); //implicit cat - children can always be assigned to a parent
		//casting - animal can only see anything before animal
		catDad.setName("Grant");
		//cat = new Dog("Test", "male", 67); - demonstrating polymorphism bc cat and dog can be equals tgt 
		
		
		//Cat animalCat = cat;   - can't cast from animal to cat
		//we want to cast animal type to a child cat type
		Cat animalCat = (Cat)catDad; //explicit cast - when attempting to access methods from child
								// you will need to cast
		animalCat.setHairType("long hair"); // so now we can use hairtype method
		
		/////////////////////////////////////////////////////////////
		ArrayList <Animal> animals = new ArrayList<>();
		animals.add(a);
		animals.add(c);
		Cat temp = ((Cat)animals.get(1)); //index 1 is c depending on the order of the list
		temp.setHairType("blonde");
		animals.add(animalCat);		
		animals.add(new Dog("Fido", "male", 7));
		animals.add(new Tiger("Tony", "male", 76));
		
		////////////////////////////////////////////////////////////
		//loop thru using instance method of the arraylist	
		
		for (Animal beast : animals) {
			if(beast instanceof Cat) {
				System.out.println(beast.getClass() + " this is a cat!");
			} //get class so "class inheritance"
			else if (beast instanceof Dog) {
				System.out.println(beast.getName() + " this is a dog!");
			}
			else {
				System.out.println(beast.getName());
			}
		}
		
		
		
		
		
		
		//System.out.println(animals); //going to print from toString method
		
	}

	
	
}
