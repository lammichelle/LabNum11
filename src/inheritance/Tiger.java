package inheritance;

//take behavior of cat class for tiger
public class Tiger extends Cat {
	
	private int numOfStripes; //specific behavior
	
	//constructor
	public Tiger(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	} //bc Cat is part of Animal, tiger will be under Animal as well

	//getter
	public int getNumOfStripes() {
		return numOfStripes;
	}

	//setter
	public void setNumOfStripes(int numOfStripes) {
		this.numOfStripes = numOfStripes;
	}
	
	@Override
	public void setHairType(String hairType) {
		//set a value
		//just demonstrating that we can change the behavior of a method in 
		//the parent class by overriding 
		super.setHairType(hairType);
		System.out.println("Setting the hair type for the child class Tiger!");
	}
	

}
