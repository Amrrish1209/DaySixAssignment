package com.bridgelabz.logicalproblem;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		int sum;
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < n; ++i) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}
	}
}
