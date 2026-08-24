package Leetcode;

import java.util.Arrays;

public class KthLargest_215 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}