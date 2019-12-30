package ProxyJDK;

import java.lang.reflect.Proxy;

public class MainClass {

	public static void main(String[] args) {
		MyHandler handler = new MyHandler();
		RealSubject realSubject = new RealSubject();
		handler.setRealSubject(realSubject);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		proxySubject.SellBooks();

	}

}
