package Adapter;

public class Adapter extends Source {
	public void charge() {
		super.charge();
		System.out.println("Use 18V");
	}
}
