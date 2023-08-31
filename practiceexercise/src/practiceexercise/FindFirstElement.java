package practiceexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindFirstElement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a list of integers seperated by spaces : ");
		String input=scanner.nextLine();
		List<Integer> numbers=Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Optional<Integer> firstElement=numbers.stream().findFirst();
if(firstElement.isPresent())
{
	
	System.out.println("First element: " + firstElement.get());
}
else
{
	System.out.println("The list is empty.");
}
scanner.close();

	}

}
