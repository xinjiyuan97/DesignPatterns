package Visitor;

public class ParkB implements ParkElement {
    private String name;
    
    public ParkB(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
