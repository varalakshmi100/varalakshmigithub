package exercise1week1;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the student's grade:");
		char grade=s.next().charAt(0);
		if(grade=='A') {
			System.out.println("Excellent job");
		}else if(grade == 'B') {
			System.out.println("Good job");
		}else if(grade == 'C')
		{
			System.out.println("Average job");
		}else if(grade == 'D') {
			System.out.println("Needs improvement");
		}else if(grade=='F') {
			System.out.println("Failed");
		}else
		{
			System.out.println("Invalid grade");
		}
	}

}
