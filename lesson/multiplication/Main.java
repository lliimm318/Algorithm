package com.company.Algorithm.lesson.multiplication;

import java.util.Scanner;

//백준 1629 곱셈
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(calc(a,b) % c);
    }

    private static int calc(int a, int b) {
        if (b == 0) return 1;
        else if (b == 1) return a;
        else if (b % 2 == 0) {
            int tmp = calc(a, b/2);
            return tmp * tmp;
        }
        else return a * calc(a, b-1);
    }
}
