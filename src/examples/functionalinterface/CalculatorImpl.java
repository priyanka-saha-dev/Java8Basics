package examples.functionalinterface;

import java.util.function.BiConsumer;

public class CalculatorImpl implements Calculator {

	@Override
	public void customOperation(Integer a, Integer b, BiConsumer<Integer, Integer> intConsumer) {
		intConsumer.accept(a, b);
	}


}
