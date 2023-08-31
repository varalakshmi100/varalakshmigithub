package exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentSorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> students=new ArrayList<>();
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name:  " );
			String name=sc.next();
			System.out.println("Enter age: ");
			int age=sc.nextInt();
			System.out.println("Enter grade: ");
			double grade=sc.nextDouble();
			students.add(new Student(name,age,grade));
		}
	 Collections.sort(students, Comparator.comparingInt(Student::getAge).reversed());
	 System.out.println("Sorted by Age: ");
	 students.forEach(System.out::println);
	 Collections.sort(students, Comparator.comparing(Student::getName).reversed());
	 System.out.println("Sorted by Name: ");
	 students.forEach(System.out::println);
	 Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
	 System.out.println("Sorted by Grade: ");
	 students.forEach(System.out::println);
	 sc.close();
	}

}
