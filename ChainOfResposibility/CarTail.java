package ChainOfResposibility;

public class CarTail extends CarHandler {

	@Override
	public void handle() {
		System.out.println("车尾");
		if (nextHandler == null)
			return;
	    this.nextHandler.handle();
	}

}
