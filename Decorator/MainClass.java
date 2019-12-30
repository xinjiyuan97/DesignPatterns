package Decorator;

public class MainClass {
	public static void main(String[] argv) {
		Car car = new RunCar();
		car.show();
		
		System.out.println("----------");
		FlyCarDecorator flyCar = new FlyCarDecorator(car);
		flyCar.show();
		
		System.out.println("----------");
		DiveCarDecorator diveFlyCar = new DiveCarDecorator(flyCar);
		diveFlyCar.show();
		return;
	}
}
