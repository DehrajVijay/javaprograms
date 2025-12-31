package com.Arrays;

public class SecondHighest {

    /**
     * 
     * @param arr Input array of integers
     * @return The second highest integer in the array, or null if it doesn't exist 
     *        (e.g., array has fewer than 2 distinct elements)
     */
    public static Integer findSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) return null;
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > highest) {
                second = highest;
                highest = v;
            } else if (v > second && v < highest) {
                second = v;
            }
        }
        boolean hasSecond = false;
        for (int v : arr) {
            if (v != highest) { hasSecond = true; break; }
        }
        return hasSecond ? second : null;
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 5, 3, 2};
        Integer s = findSecondHighest(a);
        if (s == null) {
            System.out.println("No second highest (array too small or all equal).");
        } else {
            System.out.println("Second highest: " + s);
        }
    }
}
