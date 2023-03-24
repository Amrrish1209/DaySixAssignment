package com.bridgelabz.logicalproblem;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		char startTime;
		char endTime;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start the stopwatch");
		startTime = sc.next().charAt(0);
		System.out.println("Press any ket to stop the stopwatch");
		endTime = sc.next().charAt(0);
		double runningTime = (endTime - startTime) / 100.0;
		System.out.println(runningTime);
		sc.close();
	}
}
