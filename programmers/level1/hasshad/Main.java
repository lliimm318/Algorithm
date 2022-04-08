package com.company.Algorithm.programmers.level1.hasshad;

// 하샤드 수
public class Main {
    public static void main(String[] args) {
        int x = 13;

        int a = x;

        boolean answer = true;
        int sum = 0;

        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }

        if(x % sum == 0) {
            System.out.println(answer);
        } else {
            System.out.println("false");
        }
    }
}
