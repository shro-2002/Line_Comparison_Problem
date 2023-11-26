package com.bridgelabs.Welcome;

import java.util.Scanner;

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

		// Length of lines
		System.out.println("Length of line 1 is: " + lengthOfLine(x1, y1, x2, y2));
		System.out.println("Length of line 2 is: " + lengthOfLine(x3, y3, x4, y4));

		// Equality of lines
		equalityOfLines(x1, y1, x2, y2, x3, y3, x4, y4);

	}

	/*
	 * @params: int
	 * 
	 * @return: length of line
	 * 
	 * @Description: calculate length of line
	 */

	public static double lengthOfLine(int x1, int y1, int x2, int y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		double length = Math.sqrt(x + y);
		return length;
	}

	/*
	 * @params: x1, y1, x2, y2, x3, y3, x4, y4
	 * 
	 * @return: boolean value
	 * 
	 * @Description: check equality of two lines
	 */

	public static boolean equalityOfLines(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

		double lengthOfLine1 = lengthOfLine(x1, y1, x2, y2);
		double lengthOfLine2 = lengthOfLine(x3, y3, x4, y4);

		String str1 = String.valueOf(lengthOfLine1);
		String str2 = String.valueOf(lengthOfLine2);

		if (str1.equals(str2)) {
			System.out.println("Line 1 is equal to Line 2");
			return true;
		} else {
			System.out.println("Line 1 is not equal to Line 2");
			return false;
		}
	}

}
