package excercise2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {

		// Create a HashMap to store students' names and grades
		HashMap<String, String> studentGrades = new HashMap<>();

		// Add students' names and grades to the HashMap
		studentGrades.put("Alice", "A");
		studentGrades.put("Bob", "B");
		studentGrades.put("Charlie", "C");

		// Print all student names and their grades
		System.out.println("Original HashMap:");
		for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
			System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
		}

		// Find and remove the student with the lowest grade
		String lowestGradeStudent = null;
		String lowestGrade = "Z";
		for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
			if (entry.getValue().compareTo(lowestGrade) < 0) {
				lowestGrade = entry.getValue();
				lowestGradeStudent = entry.getKey();
			}
		}

		studentGrades.remove(lowestGradeStudent);

		// Print the HashMap after removing the lowest grade student
		System.out.println("\nHashMap after removing the lowest grade student:");
		for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
			System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
		}
	}

}
