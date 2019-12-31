package ChainOfResposibility;

public class CarBody extends CarHandler {

	@Override
	public void handle() {
		System.out.println("车身");
		if (nextHandler == null)
			return;
		this.nextHandler.handle();
	}

}
