package com.company.Algorithm.lesson.linearStructure.hackerrank;

import java.util.ArrayList;
import java.util.List;

//Sales by Match
public class Main {
    public static void main(String[] args) {

        int n = 9;
        List<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        int[] arr = new int[n];

        for(int i = 0; i < ar.size(); i++) {
            arr[i] = ar.get(i);
        }

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] != 0 && arr[i] == arr[j]) {
                    cnt++;
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
        System.out.println(cnt);
    }
}
