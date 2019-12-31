package Visitor;

public class CleanerB implements Visitor {

	@Override
	public void visit(ParkA parkA) {
		

	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("清洁工B:负责打扫" + parkB.getName() + "的卫生。");

	}

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

}
