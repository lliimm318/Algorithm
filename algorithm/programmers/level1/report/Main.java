package com.company.Algorithm.algorithm.programmers.level1.report;

import java.util.*;

// 92334번 신고 결과 받기
public class Main {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] answer = new int[id_list.length];

        HashMap<String, Set<String>> map = new HashMap<>();

        for(String re : report) {
            String[] arr = re.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            System.out.println(set);
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        HashMap<String, Integer> count = new HashMap<>();

        for(String id : id_list) {
            count.put(id, 0);
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if(entry.getValue().size() >= k) {
                for(String value  :entry.getValue()) {
                    count.put(value, count.getOrDefault(value, 0) + 1);
                }
            }
        }

        answer = count.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
