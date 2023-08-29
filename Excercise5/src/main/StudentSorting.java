package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorting {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ram", 22, 88.6));
		students.add(new Student("Raj", 21, 70.6));
		students.add(new Student("David", 25, 90.4));
		students.add(new Student("Bob", 27, 85.0));

		Collections.sort(students, Comparator.comparingInt(Student::getAge).reversed());
		System.out.println("Sorted by Age in Descending order:");
		for (Student student : students) {
			System.out.println("Name:"+student.getName() + ",Age:" + student.getAge() + ",Grade:" + student.getGrade());

		}
		Collections.sort(students, Comparator.comparing(Student::getName));
		System.out.println("\nSorted by Name:");
		for (Student student : students) {
			System.out.println("Name:"+student.getName() + ",Age:" + student.getAge() + ",Grade:" + student.getGrade());
		}
		Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
		System.out.println("\nSorted by Grade in Descending order:");
		for (Student student : students) {
			System.out.println("Name:"+student.getName() + ",Age:" + student.getAge() + ",Grade:" + student.getGrade());
		}

	}

}
