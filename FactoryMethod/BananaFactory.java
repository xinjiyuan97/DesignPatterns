package FactoryMethod;

public class BananaFactory implements FruitFactory {
	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return (Fruit) new Banana();
	}

}
