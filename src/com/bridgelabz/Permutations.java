package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	static String A = ("bat");

	public static void Permutations1(String word, String remaining) { // recursion method
		if (remaining == null) {
			return;
		}

		if (remaining.length() == 0) {
			System.out.println(word);

		}

		for (int i = 0; i < remaining.length(); i++) {
			String newWord = word + remaining.charAt(i);
			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
			Permutations1(newWord, newRemaining);
		}
	}

	// interative method
	public static void Permutations2(String B) {
		if (B == null || B.length() == 0) {
			return;
		}
		List<String> partial = new ArrayList(); // creating an empty array
		partial.add(String.valueOf(B.charAt(0))); // initalizing the list with first char

		for (int l = 1; l < B.length(); l++) {

			for (int j = partial.size() - 1; j >= 0; j--) {
				String a = partial.remove(j);

				for (int k = 0; k <= a.length(); k++) {
					partial.add(a.substring(0, k) + B.charAt(l) + a.substring(k));
				}

			}
		}

	}

	public static void main(String[] args) {
		// Permutations1(" ", A);

		System.out.println("interative method");
		String B = ("bat");
		Permutations2(B);

	}
}