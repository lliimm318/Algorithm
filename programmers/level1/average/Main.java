package com.company.Algorithm.programmers.level1.average;

//평균 구하기
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        System.out.println(answer/arr.length);
    }
}
