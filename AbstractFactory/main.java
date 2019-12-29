package AbstractFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FruitFactory sff = (FruitFactory) new SourthFruitFactory();
       Fruit apple = sff.getApple();
       apple.get();
	}

}
