package Singleton;

public class Person2 {
	private static Person2 person;
	private Person2() {}
	public synchronized Person2 getPerson() {
		if (person == null)
			person = new Person2();
		return person;
	}
}
