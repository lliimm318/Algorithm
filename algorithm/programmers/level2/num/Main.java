package com.company.Algorithm.algorithm.programmers.level2.num;

//숫자의 표현
public class Main {
    public static void main(String[] args) {
        int n = 15;

        int answer = 1;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i + 1; j < n; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }
                else if(sum > n) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
