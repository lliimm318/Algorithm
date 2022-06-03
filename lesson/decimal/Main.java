package com.company.Algorithm.lesson.decimal;

import java.util.Scanner;

//백준 1978 소수 찾기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (prime(a)) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean prime(int n) {
        if(n < 2) return false;

        for (int i = 2; i*i <= n; i++) {
            if ((n%i) == 0) {
                return false;
            }
        }
        return true;
    }
}
