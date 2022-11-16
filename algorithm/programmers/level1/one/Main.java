package com.company.Algorithm.algorithm.programmers.level1.one;

// 87389번 나머지가 1이 되는 수 찾기
public class Main {
    public static void main(String[] args) {
        int n = 10;

        int answer = 0;

        for(int i = 1; i < n; i++) {
            if(n%i==1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
