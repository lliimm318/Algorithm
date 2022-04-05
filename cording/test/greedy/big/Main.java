package com.company.Algorithm.cording.test.greedy.big;

import java.util.Arrays;

//이것이 코딩테스트다 92p. 큰수의 법칙
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 3;
        int[] arr = {2,4,5,4,6};

        int answer = 0;

        Arrays.sort(arr);

        int cnt = 1;
        for(int i = 0; i < m; i++) {
            if(cnt%(k+1) != 0) {
                answer += arr[n-1];
            } else {
                answer += arr[n-2];
                cnt = 0;
            }
            cnt++;
        }
    }
}
