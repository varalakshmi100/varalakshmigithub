package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AverageUsingStreams{
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
	 double average=vara.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	 System.out.println("Average: "+ average);
	 sc.close();
	
}
	
	

}
