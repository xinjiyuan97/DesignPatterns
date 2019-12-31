package Visitor;

public interface Visitor {
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
	public void visit(Park park);
}
