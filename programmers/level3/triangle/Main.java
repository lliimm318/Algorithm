package com.company.Algorithm.programmers.level3.triangle;

//정수 삼각형
public class Main {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        int n = 0;
        for(int i = 1; i < triangle.length; i++) {
            dp[i][0] = triangle[i][0] + dp[i - 1][0];

            for (int j=1; j<i+1; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
            }
        }

        for (int i = 1; i < dp[dp.length-1].length; i++) {
            answer = Math.max(dp[dp.length-1][i], answer);
        }
        System.out.println(answer);

    }
}
