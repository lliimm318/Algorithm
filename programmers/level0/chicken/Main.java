package com.company.Algorithm.programmers.level0.chicken;

// 120884번 치킨쿠폰
public class Main {
    public static void main(String[] args) {

    }
    public static int solution(int chicken) {
        int answer = 0;
        int c = 0;

        if (chicken == 0) return answer;

        while (chicken != 0) {
            if (c % 10 == 0) {
                c = c - 10;
                chicken++;
                answer++;
            }
            chicken--;
            c++;
        }

        return answer;
    }
}
