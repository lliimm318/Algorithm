package com.company.Algorithm.programmers.level2.small.num;

import java.util.Arrays;

//최솟값 만들기
public class Main {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;
        for(int i = 0; i < length; i++) {
            answer += A[i] * B[length-i-1];
        }
        System.out.println(answer);

    }
}
