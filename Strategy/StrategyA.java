/**
 * Concrete Strategy
 */
package Strategy;

public class StrategyA implements Strategy {

	@Override
	public double getCost(double num) {
		return num * 0.8;
	}

}
