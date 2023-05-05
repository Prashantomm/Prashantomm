package com.masai;
import java.util.Scanner;

public class PrintDifference {
	 public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter the size: ");
				int n = input.nextInt();
				int[][] matrix = new int[n][n];

				System.out.println("Enter the elements:");
				for (int i = 0; i < n; i++) {
				  for (int j = 0; j < n; j++) {
				    matrix[i][j] = input.nextInt();
				  }
				}

				int rightDiagonal = 0;
				int leftDiagonal = 0;
				for (int i = 0; i < n; i++) {
					 rightDiagonal += matrix[i][i];
					 leftDiagonal  += matrix[i][n - 1 - i];
				}

				int difference = Math.abs(primaryDiagonal - secondaryDiagonal);
				System.out.println("The difference of the sum: " + difference);
			}
		  }

}
