/**
 * RealSubject
 */
package Proxy;

public class RealSubject implements Subject {
	@Override
	public void SellBooks() {
		System.out.println("卖书");
	}
}
