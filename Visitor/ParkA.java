package Visitor;

public class ParkA implements ParkElement {

    private String name;
    
    public ParkA(String name) {
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
