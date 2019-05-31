package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsExample {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(7,0,2,8,5,1,4,3,6,9);
		
		//numberList.stream().forEach(a -> System.out.println(a));
		numberList.stream().forEach(System.out::println);
		
		boolean containsAllEvenNumbers = numberList.stream().allMatch(num -> num%2 == 0);
		
		System.out.println("containsAllEvenNumbers : " + containsAllEvenNumbers);
		
		boolean containsAnyEvenNumbers = numberList.stream().anyMatch(num -> num%2 == 0);
		
		System.out.println("containsAnyEvenNumbers : " + containsAnyEvenNumbers);
		
		System.out.println("For each operation");
		numberList.forEach(n -> System.out.println(n*2));
		
		
		String[] names = {"harry","hogwarts","hermione","ron","neville","ginny", "draco"};
		
		List<String> nameList = Arrays.asList(names);
		
		String prefix = "e";
		
		List<String> nameListFiltered = nameList.stream().filter(e -> e.contains(prefix)).collect(Collectors.toList());
		
		System.out.println(nameListFiltered);
	}

}
