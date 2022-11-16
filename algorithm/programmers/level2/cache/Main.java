package com.company.Algorithm.algorithm.programmers.level2.cache;

import java.util.ArrayList;

// 176890번 1차 캐시
public class Main {
    public static void main(String[] args) {
        int cacheSize =  2;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        int answer = 0;
        ArrayList<String> list = new ArrayList<>();

        if(cacheSize == 0) {
            answer = cities.length * 5;
        }

        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if(list.contains(city)) {
                list.remove(city);
                list.add(city);
                answer++;
            }
            else {
                if(cacheSize == list.size()) {
                    list.remove(0);
                    list.add(city);
                }
                else {
                    list.add(city);
                }
                answer = answer + 5;
            }
        }
        System.out.println(answer);
    }
}
