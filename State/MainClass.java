package State;

public class MainClass {
    public static void main(String[] argv) {
    	Person person = new Person();
    	person.setHour(7);
    	person.doSomething();
    	
    	person.setHour(12);
    	person.doSomething();
    	
    	person.setHour(18);
    	person.doSomething();
    	
    	person.setHour(8);
    	person.doSomething();
    }
}
