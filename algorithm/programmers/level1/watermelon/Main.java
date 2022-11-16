package com.company.Algorithm.algorithm.programmers.level1.watermelon;

// 12922번 수박수박수박수박수박수? 
public class Main {
    public static void main(String[] args) {
        int n = 3;

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(i%2 == 1) {
                answer.append("박");
            } else {
                answer.append("수");
            }
        }

        System.out.println(answer.toString());
    }
}
