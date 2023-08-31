package practiceexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicateIntegersUsingStream {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a list of integers seperated by spaces: ");
		String input=scanner.nextLine();
		List<Integer> numbers=Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
	     Map<Integer, Long> frequencyMap=numbers.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
	     List<Integer> duplicates=frequencyMap.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	     System.out.println("Duplicate elements: " + duplicates);
		
		
	}

}
