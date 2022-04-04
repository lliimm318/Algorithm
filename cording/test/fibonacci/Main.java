package com.company.Algorithm.cording.test.fibonacci;

public class Main {
    public static void main(String[] args) {
        int n = 6;

        for(int i = 1; i <= n; i++) {
            System.out.println(fibo(i));
        }
    }
    private static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-2) + fibo(n-1);
    }
}
