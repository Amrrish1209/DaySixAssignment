package com.bridgelabz.logicalproblem;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 121;
		int r = 0;
		int d;
		for (; num != 0; num = num / 10) {
			d = num % 10;
			r = r * 10 + d;
		}
		System.out.println(r);
	}
}
