package exercise1week1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int i=1, factorial=1, number;
		System.out.println("Enter the number to which you need to find the factorial:");
		Scanner scanner=new Scanner(System.in);
		number = scanner.nextInt();
		while(i<=number) {
			factorial =factorial * i;
			i++;
		}
		System.out.println("Factorial of the given number is :: "+factorial);
	}

}
