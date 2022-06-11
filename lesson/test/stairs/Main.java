package com.company.Algorithm.lesson.test.stairs;

import java.util.Scanner;

//백준 10844 쉬운 계단수
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long m = 1000000000;
        long answer = 0;

        long[][] dp = new long[n+1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) dp[i][j] = (dp[i - 1][j + 1]) % m;
                else if (j == 9) dp[i][j] = (dp[i - 1][j - 1]) % m;
                else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % m;
            }
        }

        for (int i = 0; i <= 9; i++) {
            answer += dp[n][i];
        }
        System.out.println(answer % m);
    }
}
