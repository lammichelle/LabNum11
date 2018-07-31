package composition;

//HAS-A relationship (also known as composition)
public class BasketBallCoaches {
	private Person headCoach; // person objects
	private Person assistantCoach;

	public BasketBallCoaches() {

	}

	public BasketBallCoaches(Person headCoach, Person assistantCoach) {
		super();
		this.headCoach = headCoach;
		this.assistantCoach = assistantCoach;
	}

	// creating getters and setters
	public Person getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(Person headCoach) {
		this.headCoach = headCoach;
	}

	public Person getAssistantCoach() {
		return assistantCoach;
	}

	public void setAssistantCoach(Person assistantCoach) {
		this.assistantCoach = assistantCoach;
	}

	public void printCoaches() {
		System.out.println("Head Coach: ");
		System.out.println(headCoach);
		System.out.println("Assistant Coach: ");
		System.out.println(assistantCoach);
	}

}
