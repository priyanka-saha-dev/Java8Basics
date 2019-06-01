package examples.functionalinterface;

public class FunctionalInterfaceExamples {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();

		Integer a = 10, b = 6;
		System.out.println("add : " + calculator.add(a, b));
		System.out.println("multiply : " + calculator.multiply(a, b));
		System.out.println("divide : " + calculator.divide(a, b));
		System.out.println("subtract : " + calculator.subtract(a, b));

		calculator.customOperation(a, b, (x, y) -> System.out.println("modulus : " + x % y));

		// calculator.customOperation(a, b, (x, y) -> x%y ); - how?

	}

}


