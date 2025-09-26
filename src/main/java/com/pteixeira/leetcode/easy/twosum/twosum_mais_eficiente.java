package com.pteixeira.leetcode.easy.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum_mais_eficiente {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = new int[]{3, 2, 4};
        int target2 = 6;

        int[] nums3 = new int[]{3, 3};
        int target3 = 6;

        int[] retorno1 = twoSum(nums1, target1);
        int[] retorno2 = twoSum(nums2, target2);
        int[] retorno3 = twoSum(nums3, target3);

        System.out.println(Arrays.toString(retorno1));
        System.out.println(Arrays.toString(retorno2));
        System.out.println(Arrays.toString(retorno3));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            Integer indexDoComplemento = mapa.get(complemento);
            if (indexDoComplemento != null) {
                return new int[]{indexDoComplemento, i};
            }
            mapa.put(nums[i], i);
        }
        throw new IllegalArgumentException("Nenhuma solução encontrada!");
    }
}
