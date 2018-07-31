package composition;

public class Person {
//no main, bc this is a helper class
	
	private String firstName;
	private String lastName;
	private int age; 
	private String address;
	//declaring variables
	
	//generate constructor using fields (right click)
	//this is my constructor
	
	public Person() { //can set default, if print a person with no value we should see these
		//this is optional 
		firstName = "hello"; 
		lastName = "test";
		age = 100; 
		address = "";
		
		
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
			;
	}



	public Person(String firstName, String lastName, int age, String address) {
		//super(); - parent class obj, optional as of now 
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	
	
	
	
	
	
	
	
}
