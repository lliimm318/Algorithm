package com.company.Algorithm.programmers.level1.normal.divid.arr;

import java.util.ArrayList;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;

        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }
        Arrays.sort(answer);
    }
}
