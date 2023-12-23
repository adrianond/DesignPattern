package br.com.cod3r.comportamentais.strategy.calc.after.strategies;

public class AdditionOperation implements OperationStrategy {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
