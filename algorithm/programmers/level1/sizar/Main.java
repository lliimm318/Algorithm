package com.company.Algorithm.algorithm.programmers.level1.sizar;

// 12926번 시저 암호
public class Main {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;

        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) {
                c =(char) ((c - 'A' + n) % 26 + 'A');
            }
            else if(Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            }
            answer += c;
        }
        System.out.println(answer);
    }
}
