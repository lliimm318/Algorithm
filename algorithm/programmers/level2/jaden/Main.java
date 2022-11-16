package com.company.Algorithm.algorithm.programmers.level2.jaden;

// 12951번 JadenCase
public class Main {
    public static void main(String[] args) {
        String s = "3people unFollowed me";

        String answer = "";

        s = s.toLowerCase();
        String first = s.charAt(0) + "";
        answer += first.toUpperCase();

        for(int i = 1; i < s.length(); i++) {
            String now = s.charAt(i) + "";
            if(now.equals(' ')) {
                answer += " ";
            }
            else if(s.charAt(i-1) == ' ') {
                answer += now.toUpperCase();
            } else {
                answer += now;
            }
        }
        System.out.println(answer);
    }
}
