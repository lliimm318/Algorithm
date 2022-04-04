package com.company.Algorithm.cording.test.factorial;

//팩토리얼
public class Main {
    public static void main(String[] args) {
        int n = 3;

        int answer = facto(n);
        System.out.println(answer);
    }
    private static int facto(int n) {
        if(n <= 1) {
            return n;
        }
        return facto(n-1)*n;
    }
}
