package com.bridgelabs.Welcome;

import java.util.Scanner;

import com.bridgelabs.usecase1.LengthLine;
import com.bridgelabs.usecase2.EqualLines;
import com.bridgelabs.usecase3.CompareLines;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		Scanner sc = new Scanner(System.in);

		// Input co-ordinates of line 1
		System.out.println("Enter x1 co-ordinate of line 1: ");
		int x1 = sc.nextInt();

		System.out.println("Enter y1 co-ordinate of line 1: ");
		int y1 = sc.nextInt();

		System.out.println("Enter x2 co-ordinate of line 1: ");
		int x2 = sc.nextInt();

		System.out.println("Enter y2 co-ordinate of line 1: ");
		int y2 = sc.nextInt();

		// Input co-ordinates of line 2

		System.out.println("Enter x1 co-ordinate of line 2: ");
		int x3 = sc.nextInt();

		System.out.println("Enter y1 co-ordinate of line 2: ");
		int y3 = sc.nextInt();

		System.out.println("Enter x2 co-ordinate of line 2: ");
		int x4 = sc.nextInt();

		System.out.println("Enter y2 co-ordinate of line 2: ");
		int y4 = sc.nextInt();



	}

}
