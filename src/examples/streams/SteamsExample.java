package examples.streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamsExample {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(7, 0, 2, 8, 5, 1, 4, 3, 6, 9);

		// numberList.stream().forEach(a -> System.out.println(a));
		// numberList.stream().forEach(System.out::println);

		boolean containsAllEvenNumbers = numberList.stream().allMatch(num -> num % 2 == 0);

		// System.out.println("containsAllEvenNumbers : " + containsAllEvenNumbers);

		boolean containsAnyEvenNumbers = numberList.stream().anyMatch(num -> num % 2 == 0);

		// System.out.println("containsAnyEvenNumbers : " + containsAnyEvenNumbers);
		
		boolean containsNoMatchedNumbers = numberList.stream().noneMatch(num -> num % 100  == 0);

		// System.out.println("containsNoMatchedNumbers : " + containsNoMatchedNumbers);

		// System.out.println("For each operation");
		// numberList.forEach(n -> System.out.println(n * 2));

		String[] names = { "harry", "hogwarts", "hermione", "ron", "neville", "ginny", "draco", "snape", "dumbledore",
				"hagrid", "sirius", "voldemort", "luna" };

		List<String> nameList = Arrays.asList(names);

		String prefix = "e";

//		List<String> nameListFiltered = nameList.stream().filter(e -> e.contains(prefix)).collect(Collectors.toList());
//		nameListFiltered.stream().forEach(System.out::println);

		System.out.println("--------------------Contains letter e--------------------");
		nameList.stream()
				.filter(e -> e.contains(prefix))
				.forEach(System.out::println);
		
		System.out.println("--------------------All in uppercase--------------------");
		nameList.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
		
		System.out.println("--------------------Sorted--------------------");
		nameList.stream()
				.sorted()
				.forEach(System.out::println);
		
		System.out.println("--------------------All operations & Reduced--------------------");
		nameList.stream()
				.filter(e -> e.contains(prefix))
				.map(String::toUpperCase)
				.sorted()
				.reduce((a , b) -> a+ "_"+b)
				.ifPresent(System.out::println);
		
		/*
		 * System.out.println("Stream generate"); Stream<Date> stream =
		 * Stream.generate(() -> new Date()); stream.forEach(System.out::println);
		 */

	}

}
