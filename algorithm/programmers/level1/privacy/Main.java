package com.company.Algorithm.algorithm.programmers.level1.privacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 150370번 개인정보 수집 유효기간
public class Main {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        solution(today, terms, privacies);
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            hashMap.put(s[0], Integer.valueOf(s[1]));
        }

        int cnt = 1;
        for (String p : privacies) {
            String[] work = p.split(" ");

            if (days(work[0]) + hashMap.get(work[1]) < days(today)) {
                answer.add(cnt);
            }

            cnt++;
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int days(String day) {
        String[] num = day.split("\\.");
        int y = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        int d = Integer.parseInt(num[2]);

        return (y * 12 * 30) + (m * 30) + d;
    }

}
