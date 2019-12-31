package Mediator;

public class Woman extends People {

	public Woman(String name, int age, Mediator mediator) {
		super(name, age, mediator);
	}

	@Override
	public void getPartner(People people) {
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(people);
	}

}
