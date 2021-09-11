package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
	
		list.add(new Student(1, "철수", 22));
		list.add(new Student(2, "영희", 23));
		list.add(new Student(3, "가가", 28));
		list.add(new Student(4, "나은", 21));
		list.add(new Student(5, "희라", 33));
		list.add(new Student(6, "지은", 21));
		list.add(new Student(7, "보현", 20));
		list.add(new Student(8, "민영", 23));
		list.add(new Student(9, "혜임", 21));
		list.add(new Student(10, "코코", 25));
		
		System.out.println("Student List");
		for(Student obj : list) {
			System.out.println("Student " + obj.toString());
		}
		
		System.out.println("\nStudent List (ordered by name)");
		Collections.sort(list);
		for(Student obj : list) {
			System.out.println("Student " + obj.toString());
		}
		
		System.out.println("\nStudent List (reverse ordered by name)");
		Collections.sort(list, Collections.reverseOrder());
		for(Student obj : list) {
			System.out.println("Student " + obj.toString());
		}
		
	}

}
