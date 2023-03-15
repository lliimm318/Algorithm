package com.company.Algorithm.algorithm.leetcode.longest;

// Longest Substring Without Repeating Characters
public class Main {
    public static void main(String[] args) {
        String s= "pwwkew";

        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (answer > s.length() - i) {
                return answer;
            }

            for (int j = i; j < s.length()-1; j++) {
                if (s.charAt(j) == s.charAt(j+1)) {
                    answer = 0;
                    break;
                }
                answer++;
            }
        }

        return 0;
    }
}
