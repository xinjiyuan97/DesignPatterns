package Mediator;

public class Man extends People {

	public Man(String name, int age, Mediator mediator) {
		super(name, age, mediator);
	}

	@Override
	public void getPartner(People people) {
		this.getMediator().setMan(this);
		this.getMediator().getPartner(people);
	}

}
