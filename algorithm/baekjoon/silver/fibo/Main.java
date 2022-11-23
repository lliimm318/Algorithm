package com.company.Algorithm.algorithm.baekjoon.silver.fibo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1003번 피보나치수
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(a);
            if (max < a) max = a;
        }
        if (list.size() == 1 && list.get(0) == 0) {
            System.out.println("0 0");
            return;
        }

        long[][] dp = new long[max+1][2];

        dp[0][0] = 1; // 0일 때 0의 수
        dp[0][1] = 0; // 0일 때 1의 수
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= max; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (Integer i : list) {
            System.out.print(dp[i][0] + " " + dp[i][1]);
        }
    }
}
