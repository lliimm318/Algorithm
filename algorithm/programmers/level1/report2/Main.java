package com.company.Algorithm.algorithm.programmers.level1.report2;

import java.util.*;

// 92334번 신고 결과 받기
public class Main {
    public static void main(String[] args) {
        String[] id = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        solution(id, report, 2);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> reportCount = new HashMap<>();
        HashMap<String, HashSet<String>> hashMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            hashMap.put(id_list[i], new HashSet<>());
            reportCount.put(id_list[i], i);
        }

        for (String s : report) {
            String[] user = s.split(" ");
            String reporter = user[0];
            String reported = user[1];

            hashMap.get(reported).add(reporter);
        }

        for (String s : id_list) {
            HashSet<String> result = hashMap.get(s);

            if (result.size() >= k) {
                for (String name : result) {
                    answer[reportCount.get(name)]++;
                }
            }
        }

        return answer;
    }
}
