package com.company.Algorithm.algorithm.baekjoon.silver.connect;

import java.util.Scanner;

// 11724번 연결 요소의 개수
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int node = scanner.nextInt();
        int edge = scanner.nextInt();

        int[][] graph = new int[node+1][node+1];
        boolean[] visited = new boolean[node+1];

        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        int cnt = 0;
        for (int i = 1; i <= node; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int[][] graph, boolean[] visited, int index) {
        if (visited[index]) return;

        visited[index] = true;

        for (int i = 1; i < graph.length; i++) {
            if (graph[index][i] == 1) {
                dfs(graph, visited, i);
            }
        }
    }
}
