/**
 * Proxy
 */

package ProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;
	
    public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		discount();
		Object result = method.invoke(realSubject, args);
		give();
		return result;
	}
	
	public void discount() {
		System.out.println("打折");
	}
	
	public void give() {
		System.out.println("优惠券");
	}

}
