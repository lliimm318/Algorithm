package com.company.Algorithm.algorithm.programmers.level1.between;

// 12912번 두 정수 사이의 합
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        long answer = 0;

        if(a == b) {
            answer = a;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i = min; i <= max; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}
