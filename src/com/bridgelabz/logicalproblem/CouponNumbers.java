package com.bridgelabz.logicalproblem;

public class CouponNumbers {

	public static void main(String[] args) {

		char chars[] = "abcdefghijklmnopqrstuvwxyzABCDEFGIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();

		while (random > 0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}
		String coupon = sb.toString();
		System.out.println("Coupon Code: " + coupon);
	}
}
