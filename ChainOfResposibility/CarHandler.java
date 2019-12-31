package ChainOfResposibility;

public abstract class CarHandler {
	protected CarHandler nextHandler;
	
	public CarHandler setNextHandler(CarHandler nextHandler) {
		this.nextHandler = nextHandler;
		return nextHandler;
	}
	
	public abstract void handle();
}
