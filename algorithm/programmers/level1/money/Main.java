package com.company.Algorithm.algorithm.programmers.level1.money;

import java.util.Arrays;

// 12982번 예산
public class Main {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        Arrays.sort(d);

        int answer = 0;
        for(int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
