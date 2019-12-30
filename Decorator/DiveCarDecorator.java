package Decorator;

public class DiveCarDecorator extends CarDecorator {

	public DiveCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void run() {
		System.out.println("可以下潜");
	}

	@Override
	public void show() {
		this.getCar().show();
		this.run();
	}

}
