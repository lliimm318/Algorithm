package com.company.Algorithm.algorithm.programmers.level2.land;

//땅 따먹기
public class Main {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};

        int answer = 0;

        for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]); //전 수행의 가장 큰 값의 자릿수를 제외하고 가장 큰 값을 저장
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
        }

        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }


    }
}
