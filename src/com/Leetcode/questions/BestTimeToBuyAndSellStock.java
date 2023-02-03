package com.Leetcode.questions;

class Checking {
	public void maxProfit(int[] prices) {
		// assumning no profit in the starting.
		int profit = 0;
		// storing maximum value of Integer in min.
		int min = Integer.MAX_VALUE;
		// loop to traverse the array
		for (int i = 0; i < prices.length; i++) {
			// now checking if the prices at any index is less than the min value
			if (prices[i] < min) {
				// Updating the min value
				// and this process will run till all the elements get compared with min value.
				// at last the min value will be 1
				min = prices[i];
			} else {
				// returns the max of the two int values.
				// the max value at prieces[i] after the index at which the min number is found
				// Updating the profit =found the max element -min

				profit = Math.max(profit, prices[i] - min);
			}

		}
		System.out.println("The Max profit in this deal is of Rupees " + profit);
	}
};

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = { 77, 1, 5, 3, 15, 4 };
		Checking stock = new Checking();
		stock.maxProfit(prices);
	}
}
