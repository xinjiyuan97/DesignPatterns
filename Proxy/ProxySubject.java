package Proxy;

public class ProxySubject implements Subject {
	private RealSubject realSubject;
	@Override
	public void SellBooks() {
		if (realSubject == null)
			realSubject = new RealSubject();
		this.discount();
		realSubject.SellBooks();
		this.give();
	}
	
	public void discount() {
		System.out.println("打折");
	}
	
	public void give() {
		System.out.println("优惠券");
	}
}
