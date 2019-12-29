package Singleton;

public class Person3 {
	private static Person3 person;
	private Person3() {}
	public Person3 getPerson() {
		if (person == null)
			synchronized(Person3.class) {
			    if (person == null)
				    person = new Person3();
			}
		return person;
	}
}
