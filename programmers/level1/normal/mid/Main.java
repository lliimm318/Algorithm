package com.company.Algorithm.programmers.level1.normal.mid;

// 가운데 글자 가져오기
public class Main {
    public static void main(String[] args) {
        String s = "abcda";

        String answer = "";

        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        System.out.println(answer);
    }
}
