package com.company.Algorithm.algorithm.baekjoon.gold.make.big;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 2812번 크게 만들기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String number = br.readLine();

        Stack<Integer> stack = new Stack();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = number.charAt(i) - '0';

            while (!stack.isEmpty() && count < K) {
                if (stack.peek() < num) {
                    stack.pop();
                    count++;
                }
                else break;
            }

            stack.push(num);

            if (count == K) {
                sb.append(number.substring(i+1));
                break;
            }
        }

        while (!stack.isEmpty()) {
            int num = stack.pop();

            if (count < K) {
                count++;
                continue;
            }

            sb.insert(0, num);
        }

        System.out.println(sb);

        br.close();
    }
}
