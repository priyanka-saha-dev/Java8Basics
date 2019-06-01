package examples.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExamples {

	// static Integer[] numbers = { 7, 0, 2, 8, 5, 1, 4, 3, 6, 9 };
	static int offset = 100;
	// static List<Integer> items = Arrays.asList(numbers);
	// static List<Integer> items = IntStream.range(1,
	// 20).boxed().collect(Collectors.toCollection(ArrayList::new));
	static List<Integer> items = IntStream.range(1, 20).boxed().collect(Collectors.toList());

	static Integer[] itemsArr = IntStream.range(1, 20).boxed().toArray(Integer[]::new);

	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("starting thread"));
		t.start();

		items.sort((a, b) -> a.compareTo(b));

		// process(input -> System.out.println(input));
		process(System.out::println);

		processOffset((a, b) -> System.out.println(a + b));
		
	}

	private static void processOffset(BiConsumer<Integer, Integer> biconsumer) {
		items.forEach(n -> biconsumer.accept(n, offset));
	}

	private static void process(Consumer<List<Integer>> consumer) {
		consumer.accept(items);
	}

}
