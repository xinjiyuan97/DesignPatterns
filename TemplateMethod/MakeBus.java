package TemplateMethod;

public class MakeBus extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("Bus: 车头");
	}

	@Override
	public void makeBody() {
		System.out.println("Bus: 车身");
	}

	@Override
	public void makeTail() {
		System.out.println("Bus: 车尾");
	}

}
