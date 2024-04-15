package com.company.Algorithm.algorithm.leetcode.solve60.pro1;

// 1. Two Sum
// https://leetcode.com/problems/two-sum/?envType=list&envId=xo2bgr0r
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        twoSum(nums, target);
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean isEnd = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++){
                if (target == nums[i] + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    isEnd = true;
                    break;
                }
            }
            if (isEnd) {
                break;
            }
        }
        return result;
    }
}