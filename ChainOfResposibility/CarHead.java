package ChainOfResposibility;

public class CarHead extends CarHandler {

	@Override
	public void handle() {
		System.out.println("车头");
		if (nextHandler == null)
			return;
		this.nextHandler.handle();
	}

}
