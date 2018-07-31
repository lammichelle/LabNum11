package inheritance;

//concrete helper class
//creating subclass??
public class Cat extends Animal { //cat is subclass, animal is superclass
	
	//normally instance variables are in the top so we can reference it later but optional
	
	public Cat(String name, String gender, int age) { //created constructor from superclass
		super(name, gender, age);
	} 
	
	//instance variable
	private String hairType;
	//overloaded constructor
	public Cat(String name, String gender, int age, String hair) { 
		super(name, gender, age);
		hairType = hair;
		
	} 
	//getters and setters
	public String getHairType() {
		return hairType;
	}
	
	//declaring a method as final would prevent any child classes from overriding the behavior
	public void setHairType(String hairType) {
		this.hairType = hairType;
	}
	
	
	//override to string method
	//without override, the int part will not print for our created constructor
	@Override //are we returning to string type bc there's an int in default super class?
	public String toString() {
		//return super.getGender() + " "+ super.getName(); etc - super is optional
		//return getName() + " "+ getGender() + " "+ getAge() + " " + getHairType();
		return super.toString() + " " + hairType;
		
		//must return to string to work
		
		
		//default
		//return "Cat [hairType=" + hairType + "]";
	}
	
	
	
	
}
