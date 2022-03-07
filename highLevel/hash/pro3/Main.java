package com.company.highLevel.hash.pro3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = 1;

        HashMap<String, Integer> closet = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            String kind = clothes[i][1];
            closet.put(kind, closet.getOrDefault(kind, 1)+1);
        }

        for (String key : closet.keySet()) {
            answer *= closet.get(key);
        }
        System.out.println(answer-1);
    }
}
