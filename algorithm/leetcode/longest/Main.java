package com.company.Algorithm.algorithm.leetcode.longest;

import java.util.HashMap;

// Longest Substring Without Repeating Characters
public class Main {
    public static void main(String[] args) {
        String s= "pwwkew";

        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int max = 0;

       for (int i = 0; i < s.length(); i++) {
           if (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) >= start) {
               start = map.get(s.charAt(i)) + 1;
           }
           map.put(s.charAt(i), i);
           max = Math.max(max, i-start+1);
       }

        return max;
    }
}
