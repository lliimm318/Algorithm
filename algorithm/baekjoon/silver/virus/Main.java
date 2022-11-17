package com.company.Algorithm.algorithm.baekjoon.silver.virus;

import java.util.Scanner;

// 2606번 바이러스
public class Main {
    static int cnt = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int node = scanner.nextInt();
        int edge = scanner.nextInt();

        int[][] graph = new int[node+1][node+1];
        boolean[] visited = new boolean[node+1];

        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        dfs(visited, graph, 1);
        System.out.println(cnt);
    }

    static void dfs(boolean[] visited, int[][] graph, int index) {
        if (visited[index]) return;

        visited[index] = true;
        cnt++;

        for (int i = 1; i < graph[index].length; i++) {
            if (graph[1][i] == 1 && !visited[i]) {
                dfs(visited, graph, i);
            }
        }
    }
}
