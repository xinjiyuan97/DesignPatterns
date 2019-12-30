/**
 * Decorator
 */
package Decorator;

public abstract class CarDecorator implements Car {
	private Car car;
	public CarDecorator(Car car) {
		this.car = car;
	}

	public abstract void run();
	public abstract void show();
	
	public Car getCar() {
		return car;
	}
}
