package com.company.Algorithm.algorithm.programmers.level1.num.array;

// 12932번 자연수 뒤집어 배열로 만들기
public class Main {
    public static void main(String[] args) {
        long n = 12345;

        String s = n + "";
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            int num = s.charAt(s.length()-(i+1));
            answer[i] = num - '0';
        }
    }
}
