package Mediator;

public abstract class People {
	private String name;
	private int age;
	public Mediator mediator;
	
	public People(String name, int age, Mediator mediator) {
		this.name = name;
		this.age = age;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Mediator getMediator() {
		return mediator;
	}
	
	public abstract void getPartner(People people);
	
}
