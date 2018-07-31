package inheritance;

//helper concrete class

public class Animal {
	
	//default fields (attributes)
	private String name; 
	private String gender;
	private int age;
	
	public Animal() { //this must be added to use setters getters later
		
	}
	
	
	//create override constructor, getters , and setters, overrider to string
	public Animal(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override //when to use this?
	public String toString() {
		return String.format("Name: %-10s Age: %-10s Gender: %-10s", name, age, gender);		
		
		
		//default return
		//return "Animal [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

	

}
