package com.company.Algorithm.algorithm.programmers.level2.carpet;

// 42842번 카펫
public class Main {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i = 1; i <= sum; i++) {
            int width = sum / i;

            if ((i - 2) * (width - 2) == yellow) {
                answer[0] = i;
                answer[1] = width;
            }
        }
    }
}
