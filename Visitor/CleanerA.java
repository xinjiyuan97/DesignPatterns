package Visitor;

public class CleanerA implements Visitor {

	@Override
	public void visit(ParkA parkA) {
		System.out.println("清洁工A:负责打扫" + parkA.getName() + "的卫生。");

	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

}
