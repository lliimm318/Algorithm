package com.company.Algorithm.algorithm.programmers.level2.square;

//멀쩡한 사각형
public class Main {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;

        int answer = 0;

        int min = Math.min(w, h);
        int divisor = 1;

        for(int i = min; i > 0; i--) {
            if(w%i == 0 && h%i ==0) {
                divisor = i;
                break;
            }
        }
        answer = w * h - divisor;

        System.out.println(answer);


    }
}
