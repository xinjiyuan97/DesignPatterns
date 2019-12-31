package Strategy;

public class MainClass {

	public static void main(String[] args) {
		Context context = new Context(new StrategyA());
        System.out.print(context.getCost(200));
	}

}
