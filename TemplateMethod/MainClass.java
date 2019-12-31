package TemplateMethod;

public class MainClass {

	public static void main(String[] args) {
		MakeCar jeep = new MakeJeep();
		jeep.templateMethod();

		MakeCar bus = new MakeBus();
		bus.templateMethod();
	}

}
