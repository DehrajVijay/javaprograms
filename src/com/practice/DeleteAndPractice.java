package com.practice;

public class DeleteAndPractice {

	public static void main(String[] args) {
		// int profit = 0;
		// System.out.println(min);
		int[] prices = { 54, 2, 6, 787, 112, -7 };
		int max = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > max) {
				max = prices[i];
			}
		}
		System.out.println(max);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
