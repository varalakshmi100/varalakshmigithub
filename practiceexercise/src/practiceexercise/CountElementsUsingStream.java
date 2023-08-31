package practiceexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountElementsUsingStream {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a list of integers seperated by spaces: ");
		String input=scanner.nextLine();
		List<Integer> numbers=Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		long totalElements=numbers.stream().count();
		System.out.println("Total number of elements: " + totalElements);
		scanner.close();
				
		
		
		
	}
}
