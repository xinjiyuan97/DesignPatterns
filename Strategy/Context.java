/**
 * Context
 */
package Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double getCost(double cost) {
		return strategy.getCost(cost);
	}
}
