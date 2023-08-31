package exercise1week1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student's grade");
		char grade=sc.next().charAt(0);
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent job");
			break;
		case 'B' :
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Average job");
			break;
		case 'D':
			System.out.println("Needs improvement");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Invalid grade");
		}
	}

}
