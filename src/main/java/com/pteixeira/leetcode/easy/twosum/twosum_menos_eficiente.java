package com.pteixeira.leetcode.easy.twosum;

import java.util.Arrays;

public class twosum_menos_eficiente {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Error nos parâmetros de entrada");
    }
}
