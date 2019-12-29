/**
 * Concrete Factory
 */
package AbstractFactory;

public class SourthFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		return (Fruit) new SorthApple();
	}

	@Override
	public Fruit getBanana() {
		return (Fruit) new SorthBanana();
	}

}
