package com.company.Algorithm.programmers.skill.check.level2.pro1;

public class Main {
    public static void main(String[] args) {
        int n = 15;

        int answer = 0;
        int tmp = 0;

        for(int i = 0; i < n; i++) {
            tmp = 0;
            for(int j = i+1; j <= n; j++) {
                tmp += j;
                if(tmp == n) {
                    answer++;
                    break;
                }
                else if(tmp > n) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
