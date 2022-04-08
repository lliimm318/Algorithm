package com.company.Algorithm.programmers.level1.descending;

import java.util.Arrays;
import java.util.Collections;

//문자열 내림차순으로 정렬하기
public class Main {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";

        String[] arr = s.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
