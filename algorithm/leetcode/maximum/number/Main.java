package com.company.Algorithm.algorithm.leetcode.maximum.number;

import java.util.HashMap;
import java.util.HashSet;

// Maximum Number of Occurrences of a Substring
public class Main {
    public static void main(String[] args) {
        String s = "aaaa";
        int maxLetters = 1;
        int minSize = 3;
        int maxSize = 3;


        System.out.println(maxFreq(s, maxLetters, minSize, maxSize));
    }

    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i = 0; i <= s.length()-minSize; i++) {
            HashSet<Character> set = new HashSet<>();
            StringBuilder str = new StringBuilder();

            for (int j = i; j < s.length() && set.size() <= maxSize; j++) {
                set.add(s.charAt(j));
                if (set.size() <= maxLetters) {
                    str.append(s.charAt(j));
                    if (str.length() >= minSize && str.length() <= maxSize) {
                        map.put(str.toString(), map.getOrDefault(str.toString(), 0)+1);
                    }
                } else break;
            }
        }

        for (String key : map.keySet()) {
            answer = Math.max(map.get(key), answer);
        }

        return answer;
    }
}
