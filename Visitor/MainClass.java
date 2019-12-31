package Visitor;

public class MainClass {

	public static void main(String[] args) {
		ParkA parkA = new ParkA("Park A");
	    ParkB parkB = new ParkB("Park B");
	    Park park = new Park("Park", parkA, parkB);
	    CleanerA cleanerA = new CleanerA();
	    CleanerB cleanerB = new CleanerB();
	    Manager manager = new Manager();
	    
	    park.accept(cleanerA);
	    park.accept(cleanerB);
	    
	    park.accept(manager);
	}

}
