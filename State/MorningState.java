package State;

public class MorningState extends State {

	@Override
	public void doSomething(Person person) {
		if (person.getHour() == 7) 
			System.out.println("吃早饭");
		else {
			person.setState(new NoonState());
			person.doSomething();
		}

	}

}
