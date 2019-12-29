package Singleton;

public class Person {
    public static final Person person = new Person();
    private Person() {}
    
    public Person getPerson() {
    	return person;
    }
}
