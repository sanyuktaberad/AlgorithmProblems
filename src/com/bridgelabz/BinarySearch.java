package com.bridgelabz;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		String[] student = {"Sanyukta", "Kavya", "Nikita", "Shubham", "Geetesh", "Durga", "Somya", "Dinesh"};


		System.out.println("Enter the name of student you want to search : ");
		Scanner A = new Scanner(System.in);
		String searchStudent = A.next();

		for (int i = 0; i<student.length; i++) {
			if (student[i].equals(searchStudent)) {
				System.out.println("Student is present on list.");
			}
			else {
				System.out.println("Student is not present on list.");
			}
		}
	}
}