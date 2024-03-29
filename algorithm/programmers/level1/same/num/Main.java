package com.company.Algorithm.algorithm.programmers.level1.same.num;

import java.util.Arrays;
import java.util.LinkedList;

// 12906번 같은 숫자는 싫어
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        LinkedList<Integer> list = new LinkedList<>();

        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != list.getLast()) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        Integer[] li = list.toArray(new Integer[list.size()]);
        answer = Arrays.stream(li).mapToInt(Integer::intValue).toArray();
    }
}
