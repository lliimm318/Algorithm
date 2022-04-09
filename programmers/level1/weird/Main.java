package com.company.Algorithm.programmers.level1.weird;

//이상한 문자 구하기
public class Main {
    public static void main(String[] args) {
        String s = "try hello world";

        String answer = "";

        String[] arr = s.split("");

        for(int i = 0; i < s.length(); i++) {
            if(i%2 == 0) {
               arr[i].toUpperCase();
            }
            answer.concat(arr[i]);
        }

        System.out.println(answer);

    }
}
