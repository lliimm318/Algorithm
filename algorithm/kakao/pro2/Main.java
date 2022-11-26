package com.company.Algorithm.algorithm.kakao.pro2;

public class Main {
    public static void main(String[] args) {
        int[][] f = {{2,5}, {3,7}, {10, 11}};
        solution(f);
    }
    public static int solution(int[][] flowers) {
        int answer = 0;

        int min = 366;
        int max = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i][0] < min) min = flowers[i][0];
            if (flowers[i][1] > min) max = flowers[i][1];
        }

        boolean[] day = new boolean[max+1];

        for (int[] f : flowers) {
            for (int i = f[0]; i < f[1]; i++) {
                day[i] = true;
            }
        }

        for (boolean b : day) {
            if (b) answer++;
        }
        return answer;
    }
}
