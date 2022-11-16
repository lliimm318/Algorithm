package com.company.Algorithm.algorithm.programmers.level2.tuple;

import java.util.*;

//튜플
public class Main {
    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";

        String[] arr = s.substring(2, s.length() - 2).split(",|\\},\\{");
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(String i : arr) {
            int num = Integer.parseInt(i);
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }

        List<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, (o1, o2) -> (hashMap.get(o2) - hashMap.get(o1)));

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

    }
}
