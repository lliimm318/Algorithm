package com.company.Algorithm.cording.test.array.same;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"A", "A", "A", "B", "B", "C"};

        boolean answer = true;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
        }

        for (String key : hashMap.keySet()) {
            for (String k : hashMap.keySet()) {
                if(!k.equals(key) && hashMap.get(key).equals(hashMap.get(k))){
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}
