package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SecondSmallestAndLargestUsingStreams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 List<Integer> vara=new ArrayList<>();
		 System.out.println("Enter the number of elements");
		 int n=sc.nextInt();
		 System.out.println("Enter " + n + " Integers:");
		 for(int i=0;i<n;i++)
		 {
			 int numbers=sc.nextInt();
			 vara.add(numbers);
		 }
		Integer secondSmallest=vara.stream().sorted().distinct().skip(1).findFirst().orElse(null);
		Integer secondLargest=vara.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(null);
		System.out.println("Original Numbers: "+vara);
		System.out.println("Second Smallest: "+secondSmallest);
		System.out.println("Second Largest: "+secondLargest);
		
		
	}

}
