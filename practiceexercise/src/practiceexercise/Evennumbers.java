package practiceexercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evennumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a list of integers seperated by spaces: ");
		String input = scanner.nextLine();
		List<Integer> numbers=Stream.of(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> evenNumbers=numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
		System.out.println("Even numbers: "+evenNumbers);
		scanner.close();
		
		
	}

}
