package FactoryMethod;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FruitFactory ff = new BananaFactory();
       Fruit banana = ff.getFruit();
       banana.get();
	}

}
