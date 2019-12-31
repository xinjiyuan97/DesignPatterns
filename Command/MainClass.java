package Command;

public class MainClass {

	public static void main(String[] args) {
		Peddler peddler = new Peddler();
		Waiter waiter = new Waiter();
		Command apple = new AppleCommand(peddler);
		Command banana = new BananaCommand(peddler);
		waiter.addCommand(apple);
		waiter.work();
		
		waiter.addCommand(banana);
		waiter.work();
	}

}
