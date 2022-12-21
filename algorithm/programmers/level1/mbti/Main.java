package com.company.Algorithm.algorithm.programmers.level1.mbti;

import java.util.HashMap;

// 118666번 성격유형 검사하기
public class Main {
    public static void main(String[] args) {
        String[] arr = {"AN", "CF", "MJ", "RT", "NA"};
        int[] n = {5, 3, 2, 7, 5};
        solution(arr, n);
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder("");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < survey.length; i++) {
            int score = choices[i];
            String[] s = survey[i].split("");

            if(score > 0 && score < 4) {
                hashMap.put(s[0], hashMap.getOrDefault(s[0], 0) + 4 - score);
            } else if(score > 4) {
                hashMap.put(s[1], hashMap.getOrDefault(s[1], 0) + score - 4);
            }
        }

        answer.append(hashMap.getOrDefault("R", 0) >= hashMap.getOrDefault("T", 0) ? "R" : "T")
              .append(hashMap.getOrDefault("C", 0) >= hashMap.getOrDefault("F", 0) ? "C" : "F")
              .append(hashMap.getOrDefault("J", 0) >= hashMap.getOrDefault("M", 0) ? "J" : "M")
              .append(hashMap.getOrDefault("A", 0) >= hashMap.getOrDefault("N", 0) ? "A" : "N");

        return answer.toString();
    }
}
