package ChainOfResposibility;

public class MainClass {

	public static void main(String[] args) {
		CarHandler CarHead = new CarHead();
		CarHead.setNextHandler(new CarBody()).setNextHandler(new CarTail());
		CarHead.handle();
	}

}
