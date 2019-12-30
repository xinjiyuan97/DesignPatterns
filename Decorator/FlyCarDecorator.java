/**
 * Concrete Decorator
 */
package Decorator;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void run() {
		System.out.println("可以飞");
	}

	@Override
	public void show() {
		this.getCar().show();
		this.run();
	}

}
