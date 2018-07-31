package inheritance;
//helper class
public class Dog extends Animal {
	
	public Dog() {
		//default , Dog but inheriting from Animal
		//child does not know other child
	}

	public Dog(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

}
