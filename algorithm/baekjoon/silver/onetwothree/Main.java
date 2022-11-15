package com.company.Algorithm.algorithm.baekjoon.silver.onetwothree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 9095번 1,2,3 더하기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int n = 0;

        for (int i = 0; i < num; i++) {
            int input = scanner.nextInt();
            list.add(input);
            if (input > n)
                n = input;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (Integer i : list) {
            System.out.println(dp[i]);
        }
    }
}
