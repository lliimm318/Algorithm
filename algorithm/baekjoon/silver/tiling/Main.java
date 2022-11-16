package com.company.Algorithm.algorithm.baekjoon.silver.tiling;

import java.util.Scanner;

// 11726번 2n타일링
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n+1];

        if (n == 1) {
            System.out.println(1);
            return;
        }
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
