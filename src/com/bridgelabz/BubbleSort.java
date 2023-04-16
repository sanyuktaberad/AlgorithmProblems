package com.bridgelabz;

public class BubbleSort {
	public static void main(String[] args) {
		int[] A = {7, 4, 78, 96, 35, 45, 67, 12, 98, 54};
		int temp, j;

		for(int i =0; i<A.length; i++) {

			System.out.println("Array before bubble sort : "+A[i]);
		}
		if (j=1 ; (j<(A.length)-1)); j++) {            //-----------
			temp = A[j];
			A[j] = A[j+1];
			A[j+1] =  temp;
		}
		for (int i = 0; i<A.length; i++) {
			System.out.println("Array After bubble sort : "+A[i]);
		}
	}
}