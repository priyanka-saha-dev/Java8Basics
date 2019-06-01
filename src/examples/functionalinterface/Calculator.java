package examples.functionalinterface;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Calculator {

	public void customOperation(Integer a, Integer b, BiConsumer<Integer, Integer> intConsumer);

	default public Integer add(Integer a, Integer b) {
		return a + b;
	}

	default public Integer multiply(Integer a, Integer b) {
		return a * b;
	}

	default public Integer subtract(Integer a, Integer b) {
		return a - b;
	}

	default public Integer divide(Integer a, Integer b) {
		return a / b;
	}
	
	@Override
	String toString();


}
