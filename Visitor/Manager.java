package Visitor;

public class Manager implements Visitor {

	@Override
	public void visit(ParkA parkA) {
		System.out.println("管理员:检查A区卫生。");
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("管理员:检查B区卫生。");
	}

	@Override
	public void visit(Park park) {
		System.out.println("管理员:检查卫生。");
	}

}
