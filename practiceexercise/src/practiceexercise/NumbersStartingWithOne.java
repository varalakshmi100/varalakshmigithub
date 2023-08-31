package practiceexercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a list of integers seperated by spaces: ");
		String input =scanner.nextLine();
		List<Integer> numbers=List.of(input.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> numbersStartingWithOne = numbers.stream().filter(number-> String.valueOf(number).startsWith("1")).collect(Collectors.toList());
		System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
		scanner.close();
	}
	
		
	}


