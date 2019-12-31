package Strategy;

public class StrategyB implements Strategy {
	@Override
	public double getCost(double num) {
		num -= (int) (num / 100) * 20;
		return num;
	}
}
