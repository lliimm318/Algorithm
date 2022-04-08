package com.company.Algorithm.programmers.level1.lotto;

// 로또의 최고 순위와 최저 순위
public class Main {
    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] answer = new int[2];
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        int max = 0;
        int min = 0;

        for(int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    min++;
                }
            }
            if (lottos[i] == 0) {
                max++;
            }
        }
        max += min;

        answer[0] = rank[max];
        answer[1] = rank[min];
    }
}
