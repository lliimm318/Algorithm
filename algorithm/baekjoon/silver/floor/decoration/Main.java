package com.company.Algorithm.algorithm.baekjoon.silver.floor.decoration;

import java.util.Scanner;

// 1388번 바닥 장식
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[][] floor = new int[n1+1][n2+1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                floor[i][j] = scanner.nextInt();
            }
        }

    }

    static void dfs(int[][] graph, boolean[] visited, int index) {
        if (visited[index]) return;

        visited[index] = true;

        for (int i = 1; i < graph.length; i++) {
            if (graph[index][i] == 1) dfs(graph, visited, i);
        }
    }
}
