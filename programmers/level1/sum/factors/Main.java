package com.company.Algorithm.programmers.level1.sum.factors;

//약수의 합
public class Main {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;

        for(int i = 1; i<n+1; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
