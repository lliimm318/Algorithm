package com.company.Algorithm.programmers.level2.battle;

//예상 대진표
public class Main {
    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;

        int answer = 0;

        while (a!=b) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            answer++;
        }
    }
}
