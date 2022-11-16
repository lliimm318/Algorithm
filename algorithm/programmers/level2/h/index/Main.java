package com.company.Algorithm.algorithm.programmers.level2.h.index;

import java.util.Arrays;

// 42747번 H-index
public class Main {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            if(citations[i] >= citations.length-i) {
                answer = citations.length-i;
                break;
            }
        }

        System.out.println(answer);
    }
}
