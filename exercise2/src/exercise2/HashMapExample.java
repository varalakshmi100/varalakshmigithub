package exercise2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> studentGrades=new LinkedHashMap<>();
		studentGrades.put("Alice","A");
		studentGrades.put("Bob", "B");
		studentGrades.put("Charlie", "C");
		studentGrades.put("David", "D");
		studentGrades.put("Eva", "A");
		
		System.out.println("Student names and Grades");
		for(Map.Entry<String, String> entry : studentGrades.entrySet()) {
			System.out.println("Name: "+entry.getKey() + ", Grade: "+entry.getValue());
		}
		
		String lowestGrade="D";
		String lowestGradeStudent=null;
		for(Map.Entry<String, String> entry : studentGrades.entrySet()) {
			if(entry.getValue().equals(lowestGrade)) {
				lowestGradeStudent=entry.getKey();
				break;
				
			}
		}
		if(lowestGradeStudent != null) {
			studentGrades.remove(lowestGradeStudent);
		}
		
		System.out.println("\nStudent Names and Grades (After Removing Lowest Grade Student):");
		for(Map.Entry<String, String> entry: studentGrades.entrySet())
		{
			System.out.println("Name: " + entry.getKey()+ ",Grade: " +entry.getValue());
		}
		
	}

}
