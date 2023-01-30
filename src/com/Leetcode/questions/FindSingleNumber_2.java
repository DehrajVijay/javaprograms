package com.Leetcode.questions;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
	public static int singleNumber(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : nums) {
			if (hs.contains(i)) {
				Arrays.sort(nums);
				hs.remove(i);

			} else {
				hs.add(i);
			}
		}
		for (int i : hs) {
			return i;
		}
		return -1;
	}
}

public class FindSingleNumber_2 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 1, 4, 2, 2 };
		Arrays.sort(nums);
		System.out.println(Solution.singleNumber(nums));
	}
}
