package com.company.Algorithm.programmers.level1.normal.mysort;

import java.util.ArrayList;
import java.util.Collections;

//문자열 내 마음대로 정렬하기
public class Main {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] answer = {};

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);
        answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
            System.out.println(answer[i]);
        }

    }
}
