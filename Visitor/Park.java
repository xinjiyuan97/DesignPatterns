package Visitor;

public class Park implements ParkElement {
    private ParkA parkA;
    private ParkB parkB;
    private String name;
    
    public Park(String name, ParkA parkA, ParkB parkB) {
    	this.name = name;
    	this.parkA = parkA;
    	this.parkB = parkB;
    }
    
    public String getName() {
    	return name;
    }
    
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
	}

}
