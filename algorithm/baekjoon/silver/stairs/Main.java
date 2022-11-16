package com.company.Algorithm.algorithm.baekjoon.silver.stairs;

import java.util.Scanner;

//2579번 계단 오르기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stair = new int[301];
        int[] dp = new int[301];

        for (int i = 1; i <= n; i++) {
            stair[i] = scanner.nextInt();
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        dp[3] = Math.max(stair[1], stair[2]) + stair[3];
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max((stair[i-1] + dp[i-3]), dp[i-2]) + stair[i];
        }

        System.out.println(dp[n]);
    }
}
