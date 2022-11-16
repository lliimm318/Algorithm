package com.company.Algorithm.algorithm.programmers.level1.poketmon;

import java.util.HashSet;

// 1845번 폰켓몬
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int answer = 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums) {
            hashSet.add(num);
        }
        if(hashSet.size() > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = hashSet.size();
        }

        System.out.println(answer);
        System.out.println(hashSet.size());
    }
}
