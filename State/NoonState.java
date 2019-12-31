package State;

public class NoonState extends State {

	@Override
	public void doSomething(Person person) {
		if (person.getHour() == 12) 
			System.out.println("吃午饭");
		else {
			person.setState(new EveningState());
			person.doSomething();
		}

	}
}
