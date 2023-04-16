package com.bridgelabz;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		String[] student = { "Sanyukta", "Balaji", "Kavya", "Vrushabh", "Swati", "Shital", "Jay", "Amol", "Anjali",
				"Kalyani" };
		String[] Result = new String[student.length];
		String temp;
		int j;

		// System.out.println("Arrays before sorting : "+ student[]);
		System.out.println("Arrays before sorting : " + Arrays.deepToString(student));

		for (int i = 1; i < student.length; i++) {
			temp = student[i];
			j = i;

			while (j > 0 && student[j - 1].compareTo(temp) > 0) { // ******
				student[j] = student[j - 1];
				j = j - 1;
			}
			student[j] = temp;
		}
		System.out.print("Arrays after sorting : [");
		for (int i = 0; i < student.length; i++) {
			Result[i] = student[i];
			System.out.print(Result[i] + ", ");

			// Arrays.sort(student); //shortcut for ascending order
			// System.out.println("Arays after sorting : "+ Arrays.toString(student));

		}
		System.out.print("]" + '\n');

	}
}
